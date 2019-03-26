package com.fatecpg.checklist.service;

import com.fatecpg.checklist.model.User;
import com.fatecpg.checklist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser (String email, String name, String password){
        User user = new User();
        user.setEmailUser(email);
        user.setNameUser(name);
        user.setPasswordUser(password);
        user = userRepository.save(user);
        return user;
    }

    public User updateUser(User user){
        user = userRepository.save(user);
        return user;
    }

    public User findByEmail(String email){
        User user = new User();
        user = userRepository.findByEmail(email);
        return user;
    }
}
