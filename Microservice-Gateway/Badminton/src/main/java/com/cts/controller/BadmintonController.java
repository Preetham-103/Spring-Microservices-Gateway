package com.cts.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sport-badminton")
public class BadmintonController {

    private final Random random = new Random();

    @GetMapping("/display1")
    public String display() {
        if (random.nextBoolean()) {
            return "This is badminton";
        } else {
            throw new RuntimeException("Simulated service failure");
        }
    }
}
