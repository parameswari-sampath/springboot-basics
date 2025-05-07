package com.dharani.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "rooms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Room {

    @Id
    private String id;
    private String roomNumber;
    private int numberOfPax;
    private double pricePerNight;
    private List<String> amenities;

}
