package com.arboriapp.arboriapp.repository;

import com.arboriapp.arboriapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    public List<User> findByUserName(String name);
}

