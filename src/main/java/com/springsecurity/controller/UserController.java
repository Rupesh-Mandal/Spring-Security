package com.springsecurity.controller;

import com.springsecurity.model.UserModel;
import com.springsecurity.service.USerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/users")
public class UserController {


    @Autowired
    USerService uSerService;



    @GetMapping("/")
    public List<UserModel> getAllUser(){
        return uSerService.getAllUser();
    }
    @GetMapping("/{userName}")
    public UserModel getUser(@PathVariable String userName){
        return uSerService.getUser(userName);
    }

    @PostMapping("/")
    public UserModel addUser(@RequestBody UserModel userModel){
        return uSerService.addUser(userModel);
    }
}
