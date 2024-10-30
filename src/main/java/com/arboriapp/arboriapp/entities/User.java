package com.arboriapp.arboriapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String userId;
    private String password;
    private String userType;
    private String userName;
    private String location;
}
