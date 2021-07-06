package com.assignment.assignment.model;

import org.springframework.context.annotation.Primary;

// POJO
public class Course {
    private String courseTitle;
    private String courseTeacher;
    private String courseLevel;

    public Course(String courseTitle, String courseTeacher, String courseLevel) {
        this.courseTitle = courseTitle;
        this.courseTeacher = courseTeacher;
        this.courseLevel = courseLevel;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }
}
