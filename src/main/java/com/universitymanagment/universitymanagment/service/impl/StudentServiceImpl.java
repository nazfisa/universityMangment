package com.universitymanagment.universitymanagment.service.impl;

import com.universitymanagment.universitymanagment.entity.Student;
import com.universitymanagment.universitymanagment.repository.StudentRepository;
import com.universitymanagment.universitymanagment.service.StudentService;
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
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(long id) {
        Optional<Student> result = studentRepository.findById(id);
        Student student = null;
        if(result.isPresent()){
            student = result.get();
        }
        else{
            throw new RuntimeException("Did not find Student");
        }
        return student;

    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);

    }

    @Override
    public void deleteById(long id) {
        studentRepository.deleteById(id);

    }
}
