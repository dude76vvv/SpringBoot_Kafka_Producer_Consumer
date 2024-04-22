package com.dude76.mongoConsumer.service;

public interface MongoConsumeService {

    void consumeMsg(String msg);

    void upsertMsg(String msg);


}
