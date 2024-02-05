package com.example.demotestemployee.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;

@Data
@Entity
@Table(name = "dependent")
public class Dependent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Employee employee;
}
