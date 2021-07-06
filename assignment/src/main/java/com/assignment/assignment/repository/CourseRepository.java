package com.assignment.assignment.repository;

import com.assignment.assignment.model.Course;

import java.util.List;

public interface CourseRepository {
    List<Course> getCourse();
    Course createCourse (Course course);
}
