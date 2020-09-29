package com.ciaemon.ccudb.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "users")
@Data
public class User {

    public User() {}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String login;
    private String password;
    private boolean isActive;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    private Person person;




}
