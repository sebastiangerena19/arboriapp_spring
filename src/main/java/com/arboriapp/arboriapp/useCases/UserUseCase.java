package com.arboriapp.arboriapp.useCases;

import com.arboriapp.arboriapp.dto.UserDTO;
import com.arboriapp.arboriapp.entities.User;
import com.arboriapp.arboriapp.repository.UserRepository;
import com.arboriapp.arboriapp.utils.MessageUtil;
import com.arboriapp.arboriapp.utils.TransformTypeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserUseCase {

    @Autowired
    private UserRepository userRepository;

    private TransformTypeUtil transformTypeUtil;

    public String saveUser(UserDTO newUser) {

        List<User> userList = userRepository.findByUserName(newUser.getUserName());

        if(userList.isEmpty()){
           userRepository.save(transformTypeUtil.transformType(newUser, User.class));
           return MessageUtil.NEW_USER;
        }else{
            return MessageUtil.EXISTING_USER;
        }
    }

    public Optional<UserDTO> getUser(String id) {
        return userRepository.findById(id).map(user -> transformTypeUtil.transformType(user, UserDTO.class));
    }

    public Optional<UserDTO> deleteUser(String id) {
        Optional<UserDTO> userDeleted = userRepository.findById(id).map(user -> transformTypeUtil.transformType(user, UserDTO.class));

        if(userDeleted.isPresent()){
            userRepository.deleteById(id);
        }

        return userDeleted.map(user -> transformTypeUtil.transformType(user, UserDTO.class));
    }

    public Optional<UserDTO> updateUser(UserDTO updatedUser) {
        Optional<User> userToUpdate = userRepository.findById(updatedUser.getUserId());

        if(userToUpdate.isPresent()){
            userRepository.save(transformTypeUtil.transformType(updatedUser, User.class));
        }

        return userToUpdate.map(user -> transformTypeUtil.transformType(user, UserDTO.class));
    }
}
