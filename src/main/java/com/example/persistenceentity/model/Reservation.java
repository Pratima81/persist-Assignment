package com.example.persistenceentity.model;

import jakarta.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reservationDetails;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
