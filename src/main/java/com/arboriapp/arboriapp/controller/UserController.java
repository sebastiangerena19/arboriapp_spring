package com.arboriapp.arboriapp.controller;

import com.arboriapp.arboriapp.dto.UserDTO;
import com.arboriapp.arboriapp.entities.User;
import com.arboriapp.arboriapp.useCases.UserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserUseCase userUseCase;

    @PostMapping("/new")
    public ResponseEntity<String> createUser(@RequestBody UserDTO user) {
        String response = userUseCase.saveUser(user);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable String id) {
        return userUseCase.getUser(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserDTO> deleteUser(@PathVariable String id) {
        return userUseCase.deleteUser(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/update")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO user) {
        return userUseCase.updateUser(user).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
