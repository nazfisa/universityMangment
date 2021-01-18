package com.universitymanagment.universitymanagment.service.impl;

import com.universitymanagment.universitymanagment.entity.SessionSemester;
import com.universitymanagment.universitymanagment.repository.SessionSemesterRepository;
import com.universitymanagment.universitymanagment.service.SessionSemesterService;
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
public class SessionSemesterServiceIpl implements SessionSemesterService {
    private final SessionSemesterRepository sessionSemesterRepository;
    @Override
    public List<SessionSemester> findAll() {
        return sessionSemesterRepository.findAll();
    }

    @Override
    public SessionSemester findById(long id) {
        Optional<SessionSemester> result = sessionSemesterRepository.findById(id);
        SessionSemester sessionSemester = null;
        if(result.isPresent()){
            sessionSemester = result.get();
        }
        else{
            throw new RuntimeException("Did not find sessionSemester");
        }
        return sessionSemester;
    }

    @Override
    public void save(SessionSemester sessionSemester) {
        sessionSemesterRepository.save(sessionSemester);

    }

    @Override
    public void deleteById(long id) {
        sessionSemesterRepository.deleteById(id);

    }
}
