package com.serviceexchange.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin extends User {

    @Id
    private int id;
}
