package com.universitymanagment.universitymanagment.repository;

import com.universitymanagment.universitymanagment.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/9/2021, Sat
 **/
public interface CourseRepository extends JpaRepository<Course, Long> {
}
