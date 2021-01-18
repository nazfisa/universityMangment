package com.universitymanagment.universitymanagment.service.impl;

import com.universitymanagment.universitymanagment.entity.Batch;
import com.universitymanagment.universitymanagment.repository.BatchRepository;
import com.universitymanagment.universitymanagment.service.BatchService;
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
public class BatchServiceImpl implements BatchService {
    private final BatchRepository batchRepository;

    @Override
    public List<Batch> findAll() {
        return batchRepository.findAll();
    }

    @Override
    public Batch findById(long id) {
        Optional<Batch> result = batchRepository.findById(id);
        Batch batch = null;
        if(result.isPresent()){
            batch = result.get();
        }
        else{
            throw new RuntimeException("Did not find batch");
        }
        return batch;
    }

    @Override
    public void save(Batch batch) {
        batchRepository.save(batch);

    }

    @Override
    public void deleteById(long id) {
        batchRepository.deleteById(id);

    }
}
