package com.example.CourseApp_Backend.controller;

import com.example.CourseApp_Backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courses {

    @GetMapping("/")
    public String welcome() {
        return "welcome page";
    }
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Course c) {
        System.out.println(c.toString());
        return "added successfully";
    }

    @GetMapping("/view")
    public String view(){
        return "this is view page";
    }
}
