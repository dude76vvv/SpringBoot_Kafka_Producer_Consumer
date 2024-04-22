package com.dude76.kafkaProducer;

import com.dude76.kafkaProducer.config.TopicProps;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.UUID;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);



//		UUID uuid_1 = UUID.randomUUID();
//		System.out.println(uuid_1);
//		Locale locale = new Locale("en-US");
//		Faker faker = new Faker(locale);
//		String lat1 = faker.address().latitude();
//		String lon1 = faker.address().longitude();
//		String fName = faker.name().fullName();
//
//		String msg = String.format("%s from US having lat of %s and lon of %s",fName,lat1,lon1);
//		System.out.println(msg);

	}

}
