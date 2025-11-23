package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceimpl implements CourseService{

    //temporary list to store courses
    List<Course> list;

    public CourseServiceimpl(){
        list = new ArrayList<>();
        list.add(new Course(145,"Java Core Course","This course contain complete java"));
        list.add(new Course(120,"Spring boot course","Creating Spring boot"));
    }
    @Override
    public List<Course> getCourses(){
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }
}
