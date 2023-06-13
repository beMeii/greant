package com.exe.greant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wishlistId;
    private int accountId;
}
