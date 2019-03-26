package com.fatecpg.checklist.model;

import javax.persistence.*;

import lombok.Data;


@Entity @lombok.Data
public class TaskList {

    @Id @GeneratedValue
    private Integer id_list;

    private String status_list;

    private String name_list;

    private String description_list;

    private Boolean check_list;

}
