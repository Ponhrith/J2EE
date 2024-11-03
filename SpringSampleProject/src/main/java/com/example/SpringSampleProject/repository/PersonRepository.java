package com.example.SpringSampleProject.repository;

import com.example.SpringSampleProject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
