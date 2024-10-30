package com.arboriapp.arboriapp.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UserDTO {
    private String userId;
    private String password;
    private String userType;
    private String userName;
    private String location;
}
