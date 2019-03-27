package com.fatecpg.checklist.controller;

import com.fatecpg.checklist.model.User;
import com.fatecpg.checklist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewUser (@RequestParam String email, @RequestParam String name, @RequestParam String password){
        userService.createUser(email, name, password);
        return "Usuário salvo com sucesso!";
    }

    @GetMapping(path = "/update")
    public @ResponseBody String updateUserAccount (User user, @RequestParam String email, @RequestParam String password){
        user.setEmailUser(email);
        user.setPasswordUser(password);
        userService.updateUser(user);
        return "Dados alterados com sucesso!";
    }
}
