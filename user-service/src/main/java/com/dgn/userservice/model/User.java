package com.dgn.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TABLE_USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;
    @Column(name = "USER_NAME")
    private String name;
    @Column(name = "USER_SURNAME")
    private String surName;
    @Column(name = "USER_DETAIL_ID")
    private Long userDetailId;
    public User(String name, String surName, Long userDetailId) {
        this.name = name;
        this.surName = surName;
        this.userDetailId=userDetailId;
    }
}
