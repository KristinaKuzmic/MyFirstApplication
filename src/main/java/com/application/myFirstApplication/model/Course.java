package com.application.myFirstApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameOfCourse;

    public Course() {
    }

    public Course(int id, String name) {
        this.id = id;
        this.nameOfCourse = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nameOfCourse;
    }

    public void setName(String name) {
        this.nameOfCourse = name;
    }
}
