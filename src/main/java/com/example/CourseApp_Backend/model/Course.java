package com.example.CourseApp_Backend.model;

import com.example.CourseApp_Backend.dao.CourseDao;
import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String title;
    private String description;
    private String venue;
    private int duration;
    private String date;



    public Course() {
    }

    public Course(int id, String title, String description, String venue, int duration, String date) {
        Id = id;
        this.title = title;
        this.description = description;
        this.venue = venue;
        this.duration = duration;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", venue='" + venue + '\'' +
                ", duration=" + duration +
                ", date='" + date + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

}
