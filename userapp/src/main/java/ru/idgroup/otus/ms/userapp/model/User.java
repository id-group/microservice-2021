package ru.idgroup.otus.ms.userapp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(max = 256)
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
