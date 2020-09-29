package com.ciaemon.ccudb.models;

import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "experiments")
public class Experiment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @DateTimeFormat
    private Date startTime;

    @DateTimeFormat
    private Date endTime;


}
