package com.universitymanagment.universitymanagment.service.impl;

import com.universitymanagment.universitymanagment.entity.Enrollment;
import com.universitymanagment.universitymanagment.repository.EnrollmentRepository;
import com.universitymanagment.universitymanagment.service.EnrollmentService;
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
public class EnrollmentServiceImpl implements EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;
    @Override
    public List<Enrollment> findAll() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Enrollment findById(long id) {
        Optional<Enrollment> result = enrollmentRepository.findById(id);
        Enrollment enrollment = null;
        if(result.isPresent()){
            enrollment = result.get();
        }
        else{
            throw new RuntimeException("Did not find enrollment");
        }
        return enrollment;

    }

    @Override
    public void save(Enrollment enrollment) {

        enrollmentRepository.save(enrollment);
    }

    @Override
    public void deleteById(long id) {
        enrollmentRepository.deleteById(id);

    }
}
