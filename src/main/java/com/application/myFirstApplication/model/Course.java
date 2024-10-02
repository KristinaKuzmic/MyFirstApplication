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
    private List<CourseGroup> courseGroups;

    public Course() {
    }

    public Course(int id, String nameOfCourse, List<CourseGroup> courseGroups) {
        this.id = id;
        this.nameOfCourse = nameOfCourse;
        this.courseGroups = courseGroups;
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

    public List<CourseGroup> getGroups() {
        return courseGroups;
    }

    public void setGroups(List<CourseGroup> courseGroups) {
        this.courseGroups = courseGroups;
    }
}
