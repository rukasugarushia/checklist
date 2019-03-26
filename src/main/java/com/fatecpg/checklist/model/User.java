package com.fatecpg.checklist.model;

import lombok.Data;

import javax.persistence.*;

@Entity @lombok.Data
public class User {

    @Id @GeneratedValue
    private Integer id_user;

    @ManyToOne
    private TaskList id_list;

    private String email_user;

    private String password_user;

    private String name_user;

    private Boolean hasPremium_user;

}
