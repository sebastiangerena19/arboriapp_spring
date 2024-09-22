package com.arboriapp.arboriapp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vivero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVivero;

    private String ubicacionVivero;
    private String nombre;

    public void definirUbicacionVivero() {
        // Lógica
    }

    public void definirNombre() {
        // Lógica
    }

    public void definirPrecioEspecie() {
        // Lógica
    }

    // Getters y Setters
}
