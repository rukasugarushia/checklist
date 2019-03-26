package com.fatecpg.checklist.model;

import lombok.Data;

import javax.persistence.*;

@Entity @lombok.Data
public class User {

    @Id @GeneratedValue
    private Integer idUser;

    @ManyToOne
    private TaskList idList;

    private String emailUser;

    private String passwordUser;

    private String nameUser;

    private Boolean hasPremiumUser;

}
