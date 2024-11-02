package com.example.SpringSampleProject.service;

import com.example.SpringSampleProject.model.Person;
import com.example.SpringSampleProject.model.Task;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Getter
public class AddTaskServiceImpl implements AddTaskService {

    List<String> list = new ArrayList<>();

    List<Task> taskList = new ArrayList<>();

    List<Person> personList = List.of(new Person("P1", "R1"), new Person("P2", "R2"));

//    @Override
//    public List<String> getList() {
//        return list;
//    }
//
//    @Override
//    public List<Task> getTaskList() {
//        return taskList;
//    }

    @Override
    public String addTask(String task) {
        list.add(task);

        taskList.add(new Task(task, new Date(), new Person("PA", "Role1")));
        System.out.println("add new task : " + task);
        return task;
    }

    @Override
    public void printAllTask() {
        System.out.println(list);
    }

//    @Override
//    public List<String> getAllTask() {
//        return list;
//    }
//
//    @Override
//    public List<Task> getTaskList() {
//        return taskList;
//    }
}
