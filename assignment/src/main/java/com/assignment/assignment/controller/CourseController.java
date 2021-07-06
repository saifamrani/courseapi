package com.assignment.assignment.controller;

import com.assignment.assignment.model.Course;
import com.assignment.assignment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("single")
    public ResponseEntity<List<Course>> getCourse(){
        return new ResponseEntity<>(courseService.getSingleCourse(), HttpStatus.OK);
    }
    @GetMapping("all")
    public List<Course> getAllCourses(){
        return courseService.getSingleCourse();
    }
    @PutMapping (value = "new",produces = "application/json",consumes = "application/json")
    public ResponseEntity<Course> addCourse (@RequestBody Course course){
        return new ResponseEntity<>(courseService.createCourse(course),HttpStatus.OK);
    }

}
