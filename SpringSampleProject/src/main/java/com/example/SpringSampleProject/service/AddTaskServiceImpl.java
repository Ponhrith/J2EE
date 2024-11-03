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

    List<Person> personList = List.of(
            new Person("P1", "R1"),
            new Person("P2", "R2"),
            new Person("P3", "R3"));

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
    public String addTask(String task, String person) {
        list.add(task);

        Person owner = personList.stream().filter(val -> val.getName().equals(person)).findAny().orElse(
                new Person("default", "default")
        );

        taskList.add(new Task(task, new Date(), owner));
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
