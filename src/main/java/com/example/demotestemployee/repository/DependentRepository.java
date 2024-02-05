package com.example.demotestemployee.repository;

import com.example.demotestemployee.model.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependentRepository extends JpaRepository<Dependent,Long> {
}
