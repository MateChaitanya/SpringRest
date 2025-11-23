package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import java.util.List;

public interface CourseService {

    // Get all courses
    public List<Course> getCourses();

    // Get single course by ID
    public Course getCourse(long courseId);

    // Add a new course (POST)
    public Course addCourse(Course course);
}
