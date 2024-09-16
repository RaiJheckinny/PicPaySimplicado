package com.picpaysimplicado.dtos;

import com.picpaysimplicado.domain.UserType;

import java.math.BigDecimal;

public record UserDTO(String fistName, String lastName, String email, String password, BigDecimal balance, String document, UserType userType) {
}
