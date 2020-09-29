package com.ciaemon.ccudb.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "specimens")
public class Specimen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private User user;



}
