package com.dharani.demo.controller;

import com.dharani.demo.model.Room;
import com.dharani.demo.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @PostMapping
    public ResponseEntity<?> createRoom(@RequestBody Room room) {
        try {
            Room saved = roomRepository.save(room);
            return ResponseEntity
                    .status(201)
                    .body(Map.of(
                                    "message", "Room created successfully",
                                    "room",
                                    saved
                            )
                    );
        } catch (Exception e) {
            return ResponseEntity.
                    status(500).
                    body(Map.of("message", "Error creating room"));
        }
    }
}
