package com.projeto.apiRest.service;


import com.projeto.apiRest.model.WorkingDay;
import com.projeto.apiRest.repository.WorkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingService {

    WorkingRepository workingRepository;

    @Autowired
    public WorkingService(WorkingRepository workingRepository) {
        this.workingRepository = workingRepository;
    }

    public WorkingDay saveWork(WorkingDay workingDay){
        return workingRepository.save(workingDay);
    }

    public List<WorkingDay> findAll() {
        return workingRepository.findAll();
    }

    public Optional<WorkingDay> getById(Long idJornada) {
        return workingRepository.findById(idJornada);
    }

    public WorkingDay updateWork(WorkingDay workingDay){
        return workingRepository.save(workingDay);
    }

    public void deleteWork(Long idJornada) {
        workingRepository.deleteById(idJornada);
    }

}
