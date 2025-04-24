package com.serviceexchange.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Specialization {

    @Id
    private UUID id;

    @Column(unique=true, nullable=false)
    private String name;
}
