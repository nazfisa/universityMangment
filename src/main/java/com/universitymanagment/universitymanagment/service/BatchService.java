package com.universitymanagment.universitymanagment.service;

import com.universitymanagment.universitymanagment.entity.Batch;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/
@Service
public interface BatchService {
    List<Batch> findAll();

    Batch findById(long id);

    void save(Batch batch);

    void deleteById(long id);
}
