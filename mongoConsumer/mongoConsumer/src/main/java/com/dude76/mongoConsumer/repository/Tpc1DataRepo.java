package com.dude76.mongoConsumer.repository;

import com.dude76.mongoConsumer.model.Tpc1Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Tpc1DataRepo extends MongoRepository<Tpc1Data,String> {

        //custom query method here is needed
}
