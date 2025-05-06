package com.serviceexchange.service;

import com.serviceexchange.domain.User;
import com.serviceexchange.dto.UserDTO;
import com.serviceexchange.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public UUID addUser(UserDTO userDTO) {

        User user = User.builder()
                .firstName(userDTO.firstName())
                .description(userDTO.description())
                .birthDate(userDTO.birthDate())
                .build();

        userRepository.save(user);


        return user.getId();
    }

}
