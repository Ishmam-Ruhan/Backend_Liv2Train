package com.ishmamruhan.Liv2Train.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "course_name")
    private String name;

    @ManyToMany(mappedBy = "courses")
    private List<TrainingCenter> centers=new ArrayList<>();

    public Course() {
    }

    public Course(String name, List<TrainingCenter> centers) {
        this.name = name;
        this.centers = centers;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TrainingCenter> getCenters() {
        return centers;
    }

    public void setCenters(List<TrainingCenter> centers) {
        this.centers = centers;
    }
}
