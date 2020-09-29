package com.ciaemon.ccudb.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class Person {
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    private String middle_name;
    private int supervisor_id;
    private int lab;
    private String room;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String work_phone_number;
}
