package com.dude76.kafkaProducer.service;

import com.dude76.kafkaProducer.model.DummyData;

public interface ProducerService {

    void publishToTopic() throws InterruptedException;
    void publishToTopic_post(DummyData data);

}
