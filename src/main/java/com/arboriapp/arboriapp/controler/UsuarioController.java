package com.arboriapp.arboriapp.controler;

import com.arboriapp.arboriapp.entidades.Usuario;
import com.arboriapp.arboriapp.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/registrar")
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable String id) {
        return usuarioRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
