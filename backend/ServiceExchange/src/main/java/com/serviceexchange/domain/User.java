package com.serviceexchange.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class User {

    @Id
    @Setter(AccessLevel.NONE)
    private UUID id;

    @Column(nullable = false)
    private String firstName;

    private String description;

    @Column(columnDefinition = "INTEGER DEFAULT 1000")
    private int rating;

    private int lvl;

    private boolean isActivated;

    @Column(nullable = false)
    private LocalDate birthDate;

    @OneToMany
    private List<Ban> bans;

    @ManyToMany
    private List<Match> matches;
}
