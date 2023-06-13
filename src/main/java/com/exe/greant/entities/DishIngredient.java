package com.exe.greant.entities;

import jakarta.persistence.*;

@Entity
public class DishIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishIngredientId;
    private int dishId;
    private int ingredientId;
}
