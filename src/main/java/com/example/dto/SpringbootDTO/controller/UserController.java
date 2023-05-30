package com.example.dto.SpringbootDTO.controller;

import com.example.dto.SpringbootDTO.dto.UserLocationDTO;
import com.example.dto.SpringbootDTO.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;
@GetMapping("/users-Location")
    public List<UserLocationDTO> getAllUsersLocation(){
    return  userService.getAllUsersLocation();

    }
}
