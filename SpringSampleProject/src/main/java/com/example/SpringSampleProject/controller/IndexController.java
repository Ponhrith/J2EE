package com.example.SpringSampleProject.controller;


import com.example.SpringSampleProject.model.Task;
import com.example.SpringSampleProject.service.AddTaskService;
import com.example.SpringSampleProject.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequiredArgsConstructor
public class IndexController {
    //    @Autowired
    private final AddTaskService addTaskService;
    private final TaskService taskService;

    @Autowired
    public IndexController(AddTaskService addTaskService, TaskService taskService) {

        this.addTaskService = addTaskService;
        this.taskService = taskService;
    }

    @GetMapping("/index")
    public String getIndex(Model model) {
        model.addAttribute("taskList", addTaskService.getTaskList());
        model.addAttribute("personList", addTaskService.getPersonList());

//        for (Task task : addTaskService.getTaskList()) {
//            task.getName();
//        }
        return "index";
    }

//    @PostMapping("/addTask")
//    public String addTask(@RequestParam("task") String task, String person) {
//        System.out.println(person);
//        addTaskService.addTask(task, person);
//        return "redirect:/index";


    @PostMapping("/addTask")
    public String addTask(@RequestParam("task") String taskName) {
        taskService.addTask(taskName);
        return "redirect:/index";
    }

    @PostMapping("/printTask")
    public String printTask() {
        addTaskService.printAllTask();
        return "redirect:/index";
    }

}
