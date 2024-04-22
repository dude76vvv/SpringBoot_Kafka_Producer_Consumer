package com.dude76.mongoConsumer.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class Tpc1Data {

    @Id
    private String uuid;

    private String fName;
    private double lat ;
    private double lon ;
    private LocalDateTime dateTime;


}
