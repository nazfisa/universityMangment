package com.universitymanagment.universitymanagment.service.impl;

import com.universitymanagment.universitymanagment.entity.Course;
import com.universitymanagment.universitymanagment.repository.CourseRepository;
import com.universitymanagment.universitymanagment.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(long id) {
        Optional<Course> result = courseRepository.findById(id);
        Course course = null;
        if(result.isPresent()){
            course = result.get();
        }
        else{
            throw new RuntimeException("Did not find course");
        }
        return course;
    }

    @Override
    public void save(Course course) {

        courseRepository.save(course);
    }

    @Override
    public void deleteById(long id) {
        courseRepository.deleteById(id);

    }
}
