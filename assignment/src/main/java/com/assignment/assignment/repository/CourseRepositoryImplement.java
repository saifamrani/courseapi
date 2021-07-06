package com.assignment.assignment.repository;

import com.assignment.assignment.model.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CourseRepositoryImplement implements CourseRepository{
    private List<Course> list = new ArrayList<>(Arrays.asList(
            new Course("Java Basics","Jan de Vries","Niveau 100"),
            new Course("Java Advanced ","Bas de Hoop","Niveau 200")
    ));
    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public Course createCourse(Course course) {
        list.add(course);
        return course;
    }
}
