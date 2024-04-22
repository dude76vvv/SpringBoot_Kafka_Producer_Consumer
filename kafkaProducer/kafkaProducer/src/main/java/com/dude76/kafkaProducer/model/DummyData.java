package com.dude76.kafkaProducer.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DummyData {

    private String fName;
    private String uuid;
    private double lat ;
    private double lon ;
    private LocalDateTime dateTime;

}
