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
        return taskId;
    }
    public String getTaskHolderName(){
        return taskHolderName;
    }
    public String getTaskStatus(){
        return taskStatus;
    }
    public String getTaskData(){
        return taskData;
    }

    public void setTaskId(String taskId){
        this.taskId=taskId;
    }
    public void setTaskHolderName(String taskHolderName){
        this.taskHolderName=taskHolderName;
    }
    public void setTaskStatus(String taskStatus){
        this.taskStatus=taskStatus;
    }
    public void setTaskData(String taskData){
        this.taskData=taskData;
    }
    
}
