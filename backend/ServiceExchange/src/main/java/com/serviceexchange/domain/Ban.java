package com.serviceexchange.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Ban {

    @Id
    @Setter(AccessLevel.NONE)
    private UUID id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String reason;
}
