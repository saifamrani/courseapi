package com.assignment.assignment.service;

import com.assignment.assignment.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> getSingleCourse();
    Course createCourse (Course course);
}
