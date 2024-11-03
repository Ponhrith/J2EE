package com.example.SpringSampleProject.repository;

import com.example.SpringSampleProject.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
