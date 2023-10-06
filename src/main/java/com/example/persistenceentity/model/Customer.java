package com.example.persistenceentity.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Reservation> reservations;

}
