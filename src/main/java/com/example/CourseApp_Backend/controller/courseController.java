package com.example.CourseApp_Backend.controller;

import com.example.CourseApp_Backend.Resp;
import com.example.CourseApp_Backend.dao.CourseDao;
import com.example.CourseApp_Backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class courseController {
    @Autowired
    private CourseDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String, String> add(@RequestBody Course c) {
        dao.save(c);
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public List<Course> view(){
        return (List<Course>) dao.findAll();
    }
@CrossOrigin(origins = "*")
    @DeleteMapping("/delete")
    public Map<String, String>delete(@RequestBody Resp  resp) {
        List<Course> courses = (List<Course>) dao.findAll();
        HashMap<String, String> map = new HashMap<>();
    System.out.println(courses);
        for(int i = 0; i < courses.size(); i++) {

            Course c = courses.get(i);

            map.put("inside", c.getTitle());
            System.out.println("title"+c.getTitle());
        if (c.getTitle().equals(resp.getName())) {
            dao.delete( c);
            map.put("status","success");
        }
}
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Course> search(@RequestBody Course c) {
        String courseTitle= String.valueOf(c.getTitle());
        System.out.println(courseTitle);
        return (List<Course>) dao.searchEmployees(c.getTitle());
    }
}
