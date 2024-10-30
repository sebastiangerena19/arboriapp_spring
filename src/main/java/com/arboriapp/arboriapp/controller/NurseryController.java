package com.arboriapp.arboriapp.controller;

import com.arboriapp.arboriapp.dto.NurseryDTO;
import com.arboriapp.arboriapp.useCases.NurseryUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/nursery")
public class NurseryController {

    @Autowired
    private NurseryUseCase nurseryUseCase;

    @PostMapping("/new")
    public ResponseEntity<String> createUser(@RequestBody NurseryDTO nurseryDTO) {
        String response = nurseryUseCase.saveNursery(nurseryDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NurseryDTO> getUser(@PathVariable String id) {
        return nurseryUseCase.getNursery(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<NurseryDTO> deleteUser(@PathVariable String id) {
        return nurseryUseCase.deleteNursery(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/update")
    public ResponseEntity<NurseryDTO> updateUser(@RequestBody NurseryDTO Nursery) {
        return nurseryUseCase.updateNursery(Nursery).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
