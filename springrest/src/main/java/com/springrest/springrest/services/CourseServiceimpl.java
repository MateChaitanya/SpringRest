package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceimpl implements CourseService {

    // Temporary list to store courses
    List<Course> list;

    public CourseServiceimpl() {
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core Course", "This course contains complete Java"));
        list.add(new Course(120, "Spring Boot Course", "Creating Spring Boot projects"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;

        for (Course course : list) {
            if (course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    // ⭐ Added POST method (Add new course)
    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}

