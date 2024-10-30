package com.arboriapp.arboriapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ArboriApiController {

    @PostMapping("/value")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<String> getTreeValue(@RequestBody Object data){

        Random rand = new Random();
        int random1 = rand.nextInt(9);
        int random2 = rand.nextInt(9);

        int value = (100 * (random1*random2));

        return ResponseEntity.ok("$"+String.valueOf(value));
    }
}
