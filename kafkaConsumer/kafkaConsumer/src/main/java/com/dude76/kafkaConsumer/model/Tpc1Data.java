package com.dude76.kafkaConsumer.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tpc1Data {

    private String fName;
    private String uuid;
    private double lat ;
    private double lon ;
    private LocalDateTime dateTime;


}
