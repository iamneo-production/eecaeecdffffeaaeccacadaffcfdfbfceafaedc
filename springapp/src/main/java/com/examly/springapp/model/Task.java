package com.examly.springapp.model;
import java.lang.annotation.Inherited;

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
    private String taskHoderName;
    @Column
    private String taskDate;
    @Column
    private String taskName;
    @Column
    private String taskStatus;

    public String getTaskId(){
        return taskId;
    }
    public void setTaskId(String taskId){
        this.taskId=taskId;
    }
    public String getTaskId(){
        return taskId;
    }
}
