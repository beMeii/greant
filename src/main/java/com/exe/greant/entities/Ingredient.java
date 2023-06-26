package com.exe.greant.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter() @Setter()
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ingredientId;
    private String name;
    private String type;
    private String script;
    private float protein;
    private float glucid;
    private float lupid;
    private float vitaminA;
    private float vitaminB;
    private float vitaminC;
    private float vitaminD;
    private float vitaminE;
    private float vitaminK;
}
