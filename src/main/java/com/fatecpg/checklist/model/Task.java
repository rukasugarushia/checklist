package com.fatecpg.checklist.model;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity @lombok.Data
public class Task {

    @Id @GeneratedValue
    private Integer id_task;

    @ManyToOne
    private TaskList id_list;

    private String name_task;

    private String description_task;

    private Date hour_task;

    private Boolean check_task;

}
