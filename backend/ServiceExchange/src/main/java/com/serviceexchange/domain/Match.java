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
public class Match {

    @Id
    @Setter(AccessLevel.NONE)
    private UUID id;

    private LocalDateTime matchDate;

    private LocalDateTime updateDate;
}
