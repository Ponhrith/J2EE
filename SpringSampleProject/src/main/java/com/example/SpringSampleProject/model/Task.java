package com.example.SpringSampleProject.model;

import lombok.Data;
import java.util.Date;

@Data
public class Task {
    private final String name;
    private final Date date;
    private final Person owner;
}
