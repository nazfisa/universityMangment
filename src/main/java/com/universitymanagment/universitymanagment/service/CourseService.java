package com.universitymanagment.universitymanagment.service;

import com.universitymanagment.universitymanagment.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/
@Service
public interface CourseService {
    List<Course> findAll();

    Course findById(long id);

    void save(Course course);

    void deleteById(long id);
}
