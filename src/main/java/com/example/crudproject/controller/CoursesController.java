package com.example.crudproject.controller;

import com.example.crudproject.course.Course;
import com.example.crudproject.service.CourseHardcordedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {

    @Autowired
    private CourseHardcordedService courseHardcordedService;

    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {
        return courseHardcordedService.findAll();
    }
}
