package com.arboriapp.arboriapp.dto;

import lombok.Data;

@Data
public class TreeDTO {
    private Long id;

    private String species;
    private double height;
    private double DAP; // Diámetro a la altura del pecho
    private double specieValue;
    private double economicValue;
}
