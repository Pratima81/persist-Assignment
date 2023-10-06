package com.example.persistenceentity.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "deptname")
    private String deptName;

    @Column(name = "deptcode")
    private String deptCode;

    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;


}
