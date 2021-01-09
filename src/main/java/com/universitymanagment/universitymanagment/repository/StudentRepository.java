package com.universitymanagment.universitymanagment.repository;

import com.universitymanagment.universitymanagment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/8/2021, Fri
 **/
public interface StudentRepository extends JpaRepository<Student, Long> {
}
