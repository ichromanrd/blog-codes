package com.example.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;

    // setter & getter
}
