package com.universitymanagment.universitymanagment.initializer;

import com.universitymanagment.universitymanagment.entity.*;
import com.universitymanagment.universitymanagment.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/8/2021, Fri
 **/
@Component
public class ApplicationInitializer implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private BatchRepository batchRepository;
    @Autowired
    private SessionSemesterRepository sessionSemesterRepository;
    @Autowired
    private EnrollmentRepository enrollmentRepository;


    @Override
    public void run(String... args) throws Exception {


        Student student1 = new Student();
        student1.setId(1);
        student1.setName("asif");
        student1.setAcademicId("C151094");


        Department department = new Department();
        department.setId(1);
        department.setName("CSE");
        departmentRepository.save(department);

        Course course1 = new Course();
        course1.setId(1);
        course1.setName("C Programming");
        courseRepository.save(course1);

        Course course2 = new Course();
        course2.setId(2);
        course2.setName("C++ Programming");
        courseRepository.save(course2);


        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        Batch batch1 = new Batch();
        batch1.setId(1);
        batch1.setName("Batch1");
        batchRepository.save(batch1);

        SessionSemester sessionSemester = new SessionSemester();
        sessionSemester.setId(1);
        sessionSemester.setName("Session1");
        sessionSemesterRepository.save(sessionSemester);


        Enrollment enrollment = new Enrollment();
        enrollment.setId(1);
        enrollment.setCourses(courses);
        enrollment.setStudent(student1);
        enrollment.setSessionSemester(sessionSemester);
        enrollmentRepository.save(enrollment);

        student1.setBatch(batch1);
        student1.setDepartment(department);
        student1.setEnrollment(enrollment);
        studentRepository.save(student1);


    }
}
