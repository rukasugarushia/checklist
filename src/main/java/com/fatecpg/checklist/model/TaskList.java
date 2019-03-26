package com.fatecpg.checklist.model;

import javax.persistence.*;

import lombok.Data;


@Entity @lombok.Data
public class TaskList {

    @Id @GeneratedValue
    private Integer idList;

    private String statusList;

    private String nameList;

    private String descriptionList;

    private Boolean checkList;

}
