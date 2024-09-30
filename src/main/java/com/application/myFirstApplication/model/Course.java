package com.application.myFirstApplication.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameOfCourse;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Group> groups;

    public Course() {
    }

    public Course(int id, String nameOfCourse, List<Group> groups) {
        this.id = id;
        this.nameOfCourse = nameOfCourse;
        this.groups = groups;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
