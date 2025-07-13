package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String department;

    // Getters & Setters
}
