package com.example.persistenceentity.model;

import jakarta.persistence.*;


//Note: I have created one extra entity called Car,
//just for Learning purpose. Please do ignore this entity
//while grading assignment
//Thank you
@Entity
public class Car {

    @Id
    private Long id;

    private short year;

    private String model;

    private String maker;

    @ManyToOne
    //suppose if you dont like the column name as owner_is
    //we can customize the column name
//    @JoinColumn(name="customer_id")

    @JoinTable(name = "car_customer",
    joinColumns = {@JoinColumn(name = "car_id")}, //current class
    inverseJoinColumns = {@JoinColumn(name = "customer_id")})
    private Customer owner;
}
