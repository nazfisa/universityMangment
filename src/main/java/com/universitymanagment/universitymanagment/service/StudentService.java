package com.universitymanagment.universitymanagment.service;

import com.universitymanagment.universitymanagment.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/
@Service
public interface StudentService {
    List<Student> findAll();

    Student findById(long id);

    void save(Student student);

    void deleteById(long id);
}
