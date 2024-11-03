package com.example.SpringSampleProject.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "owners")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    @Column(name = "status")
    private String status;
}

