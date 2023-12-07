package com.example.skBackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmployee;
    @Column
    private String firstName;

    @Column
    private String lastName;

    @OneToOne(mappedBy = "employee")
    private Operator operator;
}
