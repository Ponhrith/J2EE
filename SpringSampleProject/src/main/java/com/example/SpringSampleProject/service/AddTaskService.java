package com.example.SpringSampleProject.service;

import com.example.SpringSampleProject.model.Task;

import java.util.List;

public interface AddTaskService {
    String addTask(String task);
    void printAllTask();

    List<String> getList();

    List<Task> getTaskList();
}

