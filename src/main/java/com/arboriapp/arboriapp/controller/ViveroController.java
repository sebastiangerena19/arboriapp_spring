package com.arboriapp.arboriapp.controller;

import com.arboriapp.arboriapp.entities.EspecieVivero;
import com.arboriapp.arboriapp.repository.EspecieViveroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ViveroController {

    @Autowired
    EspecieViveroRepository repositorio;

    @PostMapping("/crear")
    public ResponseEntity<EspecieVivero> crearVivero(@RequestBody EspecieVivero especieVivero) {
        //Lógica para crear vivero

        EspecieVivero newVivero = new EspecieVivero();

        newVivero.setPrecio(especieVivero.getPrecio());
        newVivero.setEspecie(especieVivero.getEspecie());
        newVivero.setEdadEnAnios(especieVivero.getEdadEnAnios());
        newVivero.setAltura(especieVivero.getAltura());

        repositorio.save(newVivero);


        return ResponseEntity.ok(especieVivero);
    }

    @PostMapping("/{id}/definirPrecioEspecie")
    public ResponseEntity<String> definirPrecioEspecie(@PathVariable Long id, @RequestBody EspecieVivero updateVivero) {
        // Lógica para definir precio

        EspecieVivero vivero = new EspecieVivero();
        vivero.setPrecio(updateVivero.getPrecio());
        vivero.setIdVivero(id);



        repositorio.save(vivero);

        return ResponseEntity.ok("Precio de especie definido");
    }
}
