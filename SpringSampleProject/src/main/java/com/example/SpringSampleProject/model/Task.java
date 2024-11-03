package com.example.SpringSampleProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "tasks")
@Data
@AllArgsConstructor
public class Task {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "finish_date")
    private Date finishDate;

    @Column(name = "owner_id")
    private long ownerId;
}
