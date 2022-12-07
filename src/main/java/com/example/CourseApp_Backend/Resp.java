package com.example.CourseApp_Backend;

public class Resp {
    private String name ;
    public Resp() {

    }

    public Resp(String status) {
        this.name = status;
    }

    public String getName() {
        return name;
    }
}
