package com.arboriapp.arboriapp.entidades;

import jakarta.persistence.Entity;

@Entity
public class UsuarioFinal extends Usuario {
    private String nombreDeUsuario;
    private String ubicacionDelPredio;

    public void registrarse() {
        // Implementar lógica de registro
    }

    public void actualizarPerfil() {
        // Implementar lógica de actualización de perfil
    }

    // Getters y Setters
}