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
    private Integer idSubTask;

    @ManyToOne
    private Task idTask;

    private String nameSubTask;

    private Date hourSubTask;

    private String descriptionSubTask;

    private Boolean checkSubTask;

}
