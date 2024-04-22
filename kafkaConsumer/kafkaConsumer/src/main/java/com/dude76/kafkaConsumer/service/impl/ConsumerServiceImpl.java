package com.dude76.kafkaConsumer.service.impl;

import com.dude76.kafkaConsumer.config.GsonAdapter;
import com.dude76.kafkaConsumer.model.Tpc1Data;
import com.dude76.kafkaConsumer.service.ConsumerService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.TopicPartition;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerSeekAware;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

@Service
@Slf4j
public class ConsumerServiceImpl implements ConsumerService {

    private static final String topic = "tpc1"; //your topic name


    Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDateTime.class, new GsonAdapter())
            .create();

    @Override
    @KafkaListener(topics = topic )
    public void consumeMsg(String msg) {

        System.out.println(msg);
        //converting jsonMsg to object

        Tpc1Data msgObj = gson.fromJson(msg,Tpc1Data.class);
        System.out.println(msgObj.getFName());
        System.out.println("waiting for next");

    }







}






