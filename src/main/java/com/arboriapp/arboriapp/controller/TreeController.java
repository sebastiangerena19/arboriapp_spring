package com.arboriapp.arboriapp.controller;

import com.arboriapp.arboriapp.dto.TreeDTO;
import com.arboriapp.arboriapp.useCases.TreeUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tree")
public class TreeController {

    @Autowired
    private TreeUseCase TreeUseCase;

    @PostMapping("/new")
    public ResponseEntity<String> createUser(@RequestBody TreeDTO TreeDTO) {
        String response = TreeUseCase.saveTree(TreeDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TreeDTO> getUser(@PathVariable String id) {
        return TreeUseCase.getTree(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TreeDTO> deleteUser(@PathVariable String id) {
        return TreeUseCase.deleteTree(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/update")
    public ResponseEntity<TreeDTO> updateUser(@RequestBody TreeDTO Tree) {
        return TreeUseCase.updateTree(Tree).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
