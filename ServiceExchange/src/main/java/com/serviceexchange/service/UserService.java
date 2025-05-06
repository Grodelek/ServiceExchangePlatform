package com.serviceexchange.service;

import com.serviceexchange.domain.Ban;
import com.serviceexchange.domain.Match;
import com.serviceexchange.domain.Specialization;
import com.serviceexchange.domain.User;
import com.serviceexchange.dto.UserDTO;
import com.serviceexchange.repository.BanRepository;
import com.serviceexchange.repository.MatchRepository;
import com.serviceexchange.repository.SpecializationRepository;
import com.serviceexchange.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final SpecializationRepository specializationRepository;
    private final MatchRepository matchRepository;
    private final BanRepository banRepository;

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();


        return userRepository.findAll();
    }

    public UUID addUser(UserDTO userDTO) {

        List<Specialization> specializations = specializationRepository.findAllById(userDTO.specializations());
        List<Match> matches = matchRepository.findAllById(userDTO.matches());
        List<Ban> bans = banRepository.findAllById(userDTO.bans());


        User user = User.builder()
                .firstName(userDTO.firstName())
                .description(userDTO.description())
                .birthDate(userDTO.birthDate())
                .bans(bans)
                .specializations(specializations)
                .matches(matches)
                .lvl(userDTO.lvl())
                .rating(userDTO.rating())
                .isActivated(userDTO.isActivated())
                .build();

        userRepository.save(user);


        return user.getId();
    }

}
