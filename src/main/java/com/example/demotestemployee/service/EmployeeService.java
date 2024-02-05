package com.example.demotestemployee.service;

public interface EmployeeService {
    void create();

    void save();

    void saveEmployeeDepartment();

    void addEmployeeDepartment2(long departmentId);

    void addDependentForEmployee();
}
