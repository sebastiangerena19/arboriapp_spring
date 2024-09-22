package com.arboriapp.arboriapp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    private String IDdeUsuario;

    private String contrasena;

    // Métodos
    public boolean verificarIngreso(String password) {
        return this.contrasena.equals(password);
    }
}
// Getters y Setters