package com.arboriapp.arboriapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Nursery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String specie;
    private String location;
    private String name;
    private double DAP;
    private double price;
    private double ageInYears;
    private double height;
    private double cupWidth;

}
