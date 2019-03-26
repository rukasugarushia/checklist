package com.fatecpg.checklist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import lombok.Data;

@Entity @lombok.Data
public class SubTask {

    @Id @GeneratedValue
    private Integer id_sub_task;

    @ManyToOne
    private Task id_task;

    private String name_sub_task;

    private Date hour_sub_task;

    private String description_sub_task;

    private Boolean check_sub_task;

}
