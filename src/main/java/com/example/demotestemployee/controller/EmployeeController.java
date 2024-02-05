package com.example.demotestemployee.controller;

import com.example.demotestemployee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/employees")
    public void addEmployee(){
        employeeService.create();
    }

    @PostMapping("/departments")
    public void addDepartment(){
        employeeService.save();
    }

    @PostMapping("/addEmployeeDepartments")
    public void saveEmployeeDepartment(){
        employeeService.saveEmployeeDepartment();
    }

    @PostMapping("/addEmployeeDepartments2/{department-id}")
    public void addEmployeeDepartment2(@PathVariable ("department-id") long departmentId){
        employeeService.addEmployeeDepartment2(departmentId);
    }

    @PostMapping("/addDependentEmployee")
    public void addDependentForEmployee(){
        employeeService.addDependentForEmployee();
    }
}
