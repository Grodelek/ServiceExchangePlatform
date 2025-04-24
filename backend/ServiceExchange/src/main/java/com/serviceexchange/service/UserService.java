package com.serviceexchange.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.serviceexchange.domain.User;
import com.serviceexchange.dto.UserDTO;
import com.serviceexchange.repository.UserRepository;

public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO) {
    if (userDTO == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User cannot be empty");
    }
    User user = new User();
    user.setFirstName(userDTO.getFirstName());
    user.setDescription(userDTO.getDescription());
    user.setBirthDate(userDTO.getBirthDate());
    user.setLvl(0);
    user.setRating(0);
    user.setActivated(false);
    userRepository.save(user);
    return ResponseEntity.status(HttpStatus.OK).body("User added successfully");
  }

}
