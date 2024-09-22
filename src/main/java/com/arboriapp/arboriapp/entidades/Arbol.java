package com.arboriapp.arboriapp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arbol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String especie;
    private double altura;
    private double DAP; // Diámetro a la altura del pecho
    private double precioEspecie;
    private double valorEconomico;

    public void definirEspecie() {
        // Lógica
    }

    public void definirAltura() {
        // Lógica
    }

    public void definirDAP() {
        // Lógica
    }

    public void definirPrecio() {
        // Lógica
    }

    public void definirValorEconomico() {
        // Lógica
    }

    // Getters y Setters
}

