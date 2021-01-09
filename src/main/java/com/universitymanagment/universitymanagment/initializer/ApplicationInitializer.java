package com.universitymanagment.universitymanagment.initializer;

import com.universitymanagment.universitymanagment.entity.Student;
import com.universitymanagment.universitymanagment.repository.StudentRepository;
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


    @Override
    public void run(String... args) throws Exception {


//        Student student1 = new Student();
//        student1.setId(1);
//        student1.setAcademicId("C151094");
//        student1.setName("Nazim");
//        studentRepository.save(student1);
//
//        Student student2 = new Student();
//        student2.setId(2);
//        student2.setAcademicId("C151095");
//        student2.setName("Nishad");
//        studentRepository.save(student2);
//        Session session1 = new Session();
//        session1.setId(1);
//        session1.setName("Spring20");
//        Session session2 = new Session();
//        session2.setId(2);
//        session2.setName("Spring21");
//
//        List<Student> students = new ArrayList<>();
//        students.add(student1);
////        students.add(student2);
//
//        session1.setStudents(students);
//        sessionRepository.save(session1);
//        sessionRepository.save(session2);
//        List<Session> sessions = List.of(session1, session2);


//        student1.setSessions(sessions);
//        student2.setSessions(sessions);
//        studentRepository.save(student1);
//        studentRepository.save(student2);



    }
}
