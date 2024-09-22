package com.arboriapp.arboriapp.repositorio;

import com.arboriapp.arboriapp.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {}

