package com.mycompany.stockmanagement.service;

import com.mycompany.stockmanagement.entities.USER;
import com.mycompany.stockmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    
    public USER getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }
    
    public void saveUser(USER user) {
        userRepository.save(user);
    }
    
    public boolean deleteUser(int userId) {
    if (userRepository.existsById(userId)) {
        userRepository.deleteById(userId);
        return true;
    } else {
        return false; 
    }
}

    
    public List<USER> getAllUsers() {
        return userRepository.findAll();
    }
    
    public USER createUser(USER user) {
        return userRepository.save(user);
    }
    
    public USER updateUser(int userId, USER updatedUser) {
        if (userRepository.existsById(userId)) {
            updatedUser.setUserID(userId);
            return userRepository.save(updatedUser);
        } else {
            return null;
        }
    }
    
  
}

