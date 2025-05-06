package com.serviceexchange.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
  private String firstName;
  private String description;
  private LocalDate birthDate;
}
