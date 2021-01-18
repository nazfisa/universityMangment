package com.universitymanagment.universitymanagment.service.impl;

import com.universitymanagment.universitymanagment.entity.Department;
import com.universitymanagment.universitymanagment.repository.DepartmentRepository;
import com.universitymanagment.universitymanagment.service.DepartmentService;
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
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;
    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(int id) {
        Optional<Department> result = departmentRepository.findById(id);
        Department department = null;
        if(result.isPresent()){
            department = result.get();
        }
        else{
            throw new RuntimeException("Did not find department");
        }
        return department;

    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);

    }

    @Override
    public void deleteById(int id) {
        departmentRepository.findById(id);

    }
}
