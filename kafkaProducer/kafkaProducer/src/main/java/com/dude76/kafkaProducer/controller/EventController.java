package com.dude76.kafkaProducer.controller;

import com.dude76.kafkaProducer.dto.MsgDto;
import com.dude76.kafkaProducer.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("api/v1/message")
public class EventController {

    @Autowired
    private ProducerService producer;

    @GetMapping("/test")
    public ResponseEntity<String> test() {

        System.out.println("reached from request");
        return ResponseEntity.ok("testing with endpoint");
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage() throws InterruptedException {

        System.out.println("reached from request2");
        producer.publishToTopic();
        return ResponseEntity.ok("published random data to kafka topic tpc1");
    }

    //send back response
    @PostMapping("/send")
    public ResponseEntity relayMessage( @RequestBody MsgDto msg) {


        //System.out.println(msg.getText());
        log.info(msg.getText());
        return ResponseEntity.ok(msg);

    }


}
