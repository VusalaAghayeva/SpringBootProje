package com.ingress2.ders2.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long age;
}
