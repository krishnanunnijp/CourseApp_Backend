package com.example.CourseApp_Backend.dao;


import com.example.CourseApp_Backend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface  CourseDao extends CrudRepository<Course,Integer> {
    @Query(value="SELECT `id`, `date`, `description`, `duration`, `title`, `venue` FROM `course` WHERE `title`= :courseTitle",nativeQuery = true)
    List<Course> searchEmployees(@Param("courseTitle") String courseTitle);
}
