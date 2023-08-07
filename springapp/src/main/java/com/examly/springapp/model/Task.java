package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Task {
    @Id
    @Column
    private String taskId;
    @Column
    private String taskHolderName;
    @Column
    private String taskData;
    @Column
    private String taskStatus;

    public String getTaskId(){
        
    }
}
