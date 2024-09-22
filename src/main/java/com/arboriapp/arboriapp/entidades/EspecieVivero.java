package com.arboriapp.arboriapp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EspecieVivero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVivero;
    private String especie;
    private double precio;
    private double altura;
    private double DAP;
    private double anchoDeCopa;
    private int edadEnAnios;

    public void definirEspecie() {
        // Lógica
    }

    public void definirPrecio() {
        // Lógica
    }

    public void definirAltura() {
        // Lógica
    }

    public void definirDAP() {
        // Lógica
    }

    public void definirAnchoDeCopa() {
        // Lógica
    }

    public void definirEdadEnAnios() {
        // Lógica
    }

    // Getters y Setters
}

