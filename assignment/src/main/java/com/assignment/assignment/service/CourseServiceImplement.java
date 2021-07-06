package com.assignment.assignment.service;

import com.assignment.assignment.model.Course;
import com.assignment.assignment.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImplement implements CourseService{
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> getSingleCourse() {
        return courseRepository.getCourse();
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.createCourse(course);
    }
}
