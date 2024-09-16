package com.picpaysimplicado.domain;

import com.picpaysimplicado.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "Users")
@Table(name = "Users")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fistName;
    private String lastName;
    @Column(unique = true)
    private String document;
    @Column(unique = true)
    private String email;
    private String passworld;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;

    public User(UserDTO data){
        this.fistName = data.fistName();
        this.lastName = data.lastName();
        this.document = data.document();
        this.email = data.email();
        this.balance = data.balance();
        this.userType = data.userType();
        this.passworld = data.password();
    }
}
