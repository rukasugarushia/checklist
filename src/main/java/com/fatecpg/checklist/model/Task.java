package com.fatecpg.checklist.model;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity @lombok.Data
public class Task {

    @Id @GeneratedValue
    private Integer idTask;

    @ManyToOne
    private TaskList idList;

    private String nameTask;

    private String descriptionTask;

    private Date hourTask;

    private Boolean checkTask;

}
