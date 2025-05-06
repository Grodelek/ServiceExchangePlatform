package com.serviceexchange.dto;

import java.time.LocalDate;

public record UserDTO(
        String firstName,
        String description,
        LocalDate birthDate) {
}
