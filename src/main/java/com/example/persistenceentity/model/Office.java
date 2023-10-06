package com.example.persistenceentity.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;

    // Other office properties

    @OneToMany(mappedBy = "office")
    private List<Employee> employees;
}
