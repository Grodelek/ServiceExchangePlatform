package com.serviceexchange.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

  @Id
  @Setter(AccessLevel.NONE)
  @GeneratedValue(strategy = GenerationType.UUID)
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
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
  private List<Ban> bans = new ArrayList<>();
  @ManyToMany
  private List<Match> matches = new ArrayList<>();
  @ManyToMany
  private List<Specialization> specializations = new ArrayList<>();
}
