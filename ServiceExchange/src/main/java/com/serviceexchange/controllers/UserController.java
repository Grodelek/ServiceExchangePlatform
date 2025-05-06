package com.serviceexchange.controllers;

import com.serviceexchange.domain.User;
import com.serviceexchange.dto.UserDTO;
import com.serviceexchange.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/all")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public UUID addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }
}
