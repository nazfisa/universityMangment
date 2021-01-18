package com.universitymanagment.universitymanagment.service;

import com.universitymanagment.universitymanagment.entity.SessionSemester;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/
@Service
public interface SessionSemesterService {
    List<SessionSemester> findAll();

    SessionSemester findById(long id);

    void save(SessionSemester sessionSemester);

    void deleteById(long id);
}
