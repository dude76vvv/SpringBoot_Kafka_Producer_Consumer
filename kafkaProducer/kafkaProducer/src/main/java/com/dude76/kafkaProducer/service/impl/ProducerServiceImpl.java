package com.dude76.kafkaProducer.service.impl;

import com.dude76.kafkaProducer.config.GsonAdapter;
import com.dude76.kafkaProducer.config.TopicProps;
import com.dude76.kafkaProducer.model.DummyData;
import com.dude76.kafkaProducer.service.ProducerService;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;

import static java.lang.String.format;

@Slf4j
@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    private TopicProps topicProps;


    //using faker data to generate n record messages
    //publish to topic
    @Override
    public void publishToTopic() throws InterruptedException {

        log.info("generating random data now");

        Locale locale = new Locale("en-US");
        Faker faker = new Faker(locale);

        //cannot serialize LocalDateTime
//        Gson gson = new Gson();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new GsonAdapter())
                .create();

        for (int i = 0; i < 5 ; i++) {

            UUID uuid_1 = UUID.randomUUID();
            String lat1 = faker.address().latitude();
            String lon1 = faker.address().longitude();
            String fName = faker.name().fullName();
            double lat1_d = Double.parseDouble(lat1);
            double lon1_d = Double.parseDouble(lon1);

            DummyData data = DummyData.builder()
                    .fName(fName)
                    .uuid(uuid_1.toString())
                    .lat(lat1_d)
                    .lon(lon1_d)
                    .dateTime(LocalDateTime.now())
                    .build();

            //convert POJO to json
            String jsonData = gson.toJson(data);

//            System.out.println(jsonData);
            log.info(jsonData);

            //sending the jsonString to kafka
            kafkaTemplate.send(topicProps.getTopic(),jsonData);
            log.info(format("Sending message to designated Topic"));

            Thread.sleep(1000);


        }









    }

    @Override
    public void publishToTopic_post(DummyData data) {

    }
}
