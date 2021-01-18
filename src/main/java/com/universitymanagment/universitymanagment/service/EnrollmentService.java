package com.universitymanagment.universitymanagment.service;

import com.universitymanagment.universitymanagment.entity.Enrollment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/
@Service
public interface EnrollmentService {
    List<Enrollment> findAll();

    Enrollment findById(long id);

    void save(Enrollment enrollment);

    void deleteById(long id);
}
