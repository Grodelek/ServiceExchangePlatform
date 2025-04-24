package com.serviceexchange.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.serviceexchange.domain.User;
import com.serviceexchange.dto.UserDTO;
import com.serviceexchange.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/all")
  public List<User> getUsers() {
    return userService.getAllUsers();
  }

  @PostMapping("/add")
  public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO) {
    return userService.addUser(userDTO);
  }
}
