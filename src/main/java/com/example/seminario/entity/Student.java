package com.example.seminario.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "tbl_student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long DNI;

    private String firstName;

    private String lastName;

    @Column(name = "email_adress", unique = true, nullable = false)
    private String email;
}
