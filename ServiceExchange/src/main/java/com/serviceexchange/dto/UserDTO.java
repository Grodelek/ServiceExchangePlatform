package com.serviceexchange.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record UserDTO(
        String firstName,
        String description,
        LocalDate birthDate,
        int rating,
        int lvl,
        boolean isActivated,
        List<UUID> bans,
        List<UUID> matches,
        List<UUID> specializations
) {
}
