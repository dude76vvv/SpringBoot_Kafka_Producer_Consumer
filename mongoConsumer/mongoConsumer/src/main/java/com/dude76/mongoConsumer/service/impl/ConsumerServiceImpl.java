package com.dude76.mongoConsumer.service.impl;

import com.dude76.mongoConsumer.config.GsonAdapter;
import com.dude76.mongoConsumer.model.Tpc1Data;
import com.dude76.mongoConsumer.repository.Tpc1DataRepo;
import com.dude76.mongoConsumer.service.MongoConsumeService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class ConsumerServiceImpl implements MongoConsumeService {

    private static final String topic = "tpc1"; //your topic name

    @Autowired
    private Tpc1DataRepo tpc1Repo;

    Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDateTime.class, new GsonAdapter())
            .create();

    @Override
//    @KafkaListener(topics = topic )
    public void consumeMsg(String msg) {

        System.out.println(msg);
        //converting jsonMsg to object
        Tpc1Data msgObj = gson.fromJson(msg,Tpc1Data.class);
//       System.out.println(msgObj.getFName());
        System.out.println("waiting for next");

    }

//listen and upsert
    @Override
    @KafkaListener(topics = topic )
    public void upsertMsg(String msg) {

        Tpc1Data msgObj = gson.fromJson(msg,Tpc1Data.class);
        log.info(msg);
//save as document to collection
        tpc1Repo.save(msgObj).getUuid();
        log.info("sending to mongoDB");




    }


}






