package com.example.persistenceentity.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "coursecode")
    private String courCode;


    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();

}
