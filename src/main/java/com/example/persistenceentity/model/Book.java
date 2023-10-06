package com.example.persistenceentity.model;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private double price;

    private String language;

    private String isbn;

    //Each book is associate with one publisher,
    //but a publisher entity doesn't have a direct reference to
    //its associated book
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}
