package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();  //abstract method  //after coming from controller this getCourse will call child class ie in class CourseServiceimpl
    public Course getCourse(long courseId);
}

