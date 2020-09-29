package com.ciaemon.ccudb.models;

import javax.persistence.*;

@Entity(name = "samples")
public class Sample {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
