package com.universitymanagment.universitymanagment.repository;

import com.universitymanagment.universitymanagment.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/9/2021, Sat
 **/
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
