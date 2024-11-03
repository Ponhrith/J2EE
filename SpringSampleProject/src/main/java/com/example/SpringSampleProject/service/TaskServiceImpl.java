package com.example.SpringSampleProject.service;

import com.example.SpringSampleProject.model.Task;
import com.example.SpringSampleProject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void addTask(String taskName){
        Task task = new Task();
        task.setName(taskName);
        taskRepository.save(task);
    }
}
