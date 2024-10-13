package com.megax.model;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private Long customerId;
    private int rating; // من 1 إلى 5
    private String comment;

    // Getters and Setters
}
