package com.projeto.apiRest.repository;

import com.projeto.apiRest.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingRepository extends JpaRepository<WorkingDay,Long> {
}
