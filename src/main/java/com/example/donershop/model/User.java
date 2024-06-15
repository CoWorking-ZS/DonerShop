package com.example.donershop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;

@Entity
@Table(name = "user")
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "user_id")
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    @NotEmpty(message = "Username should be not empty")
    @Getter
    @Setter
    private String username;

    @Column(name = "password")
    @NotEmpty(message = "Password should be not empty")
    @Getter
    @Setter
    private String password;

    @Column(name = "email")
    @NotEmpty(message = "Email should be not empty")
    @Getter
    @Setter
    @Email
    private String email;

}
