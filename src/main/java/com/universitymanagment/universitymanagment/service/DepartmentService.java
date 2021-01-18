package com.universitymanagment.universitymanagment.service;

import com.universitymanagment.universitymanagment.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/
@Service
public interface DepartmentService {
    List<Department> findAll();

    Department findById(int id);

    void save(Department department);

    void deleteById(int id);
}
