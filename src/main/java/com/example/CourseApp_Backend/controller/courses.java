package com.example.CourseApp_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courses {

    @GetMapping("/")
    public String welcome() {
        return "welcome page";
    }
}
