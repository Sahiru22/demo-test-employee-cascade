package com.example.demotestemployee.repository;

import com.example.demotestemployee.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
