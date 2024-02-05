package com.example.demotestemployee.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List <Dependent> dependents = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "employee_department",joinColumns = {@JoinColumn(name = "department_id")},inverseJoinColumns = {@JoinColumn(name = "employee_id")})
    private List <Department> departments = new ArrayList<>();
}
