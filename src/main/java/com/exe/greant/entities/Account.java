package com.exe.greant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;
    private String userName;
    private String password;
    private String name;
    private String mail;
    private String status;
    private float height;
    private float weight;
    private float BMI;
    private float TDEE;
    private float BMR;
    private int roleId;

}
