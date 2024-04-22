package com.dude76.kafkaProducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopic {
    @Autowired
    private TopicProps tp;
    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(tp.getTopic())
                .build();
    }
}
