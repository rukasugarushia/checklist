package com.fatecpg.checklist.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fatecpg.checklist.model.User;
import com.fatecpg.checklist.repository.UserRepository;
import com.fatecpg.checklist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    private UserService userService;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewUser (@RequestParam String email, @RequestParam String name, @RequestParam String password){
        User user = new User();
        user.setEmailUser(email);
        user.setNameUser(name);
        user.setPasswordUser(password);
        userRepository.save(user);
        return "Usuário salvo com sucesso!";
    }
}
