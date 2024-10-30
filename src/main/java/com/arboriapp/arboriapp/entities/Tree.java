package com.arboriapp.arboriapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String species;
    private double height;
    private double DAP; // Diámetro a la altura del pecho
    private double specieValue;
    private double economicValue;


}

