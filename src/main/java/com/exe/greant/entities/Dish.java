package com.exe.greant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishId;
    private String name;
    private String description;
    private String type;

}
