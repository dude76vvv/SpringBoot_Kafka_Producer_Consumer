package com.dude76.kafkaProducer.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "my-topics.kafka")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//referencing the value at application.properties with
//myTopics.kafka.topic
public class TopicProps {
    private String topic;

}
