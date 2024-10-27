package com.example.SpringSampleProject.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddTaskServiceImpl implements AddTaskService {
    List<String> list = new ArrayList<>();
    public void addTask(String task){
        list.add(task);
    }

    public void printAllTask(){
        System.out.println(list);
    }
}
