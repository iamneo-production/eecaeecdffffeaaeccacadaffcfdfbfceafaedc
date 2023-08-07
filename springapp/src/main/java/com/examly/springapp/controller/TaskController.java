package com.examly.springapp.controller;

import java.util.List;

import javax.annotation.processing.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp..service.TasksService;

@RestController
public class TaskController {
    @Autowired
    TasksService tasksService;

    @GetMapping("/alltasks")
    public List<Task> getAllTasks(){
        return tasksService.getAllTasks();
    }

    @GetMapping("/getTask/{taskId}")
    public Task getTask(@PathVariable("taskId") String taskId){
        return tasksService.getTaskById(taskId);
    }

    @DeleteMapping("/deleteTa")
}
