package com.application.myFirstApplication.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private int yearsOfWork;
    private LocalDate dateOfBirth;
    private LocalDate startDay;
    private LocalDate endDay;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<Group> groups;

    public Professor() {
    }

    public Professor(int id, String firstName, String lastName, int yearsOfWork, LocalDate dateOfBirth, LocalDate startDay, LocalDate endDay, List<Group> groups) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfWork = yearsOfWork;
        this.dateOfBirth = dateOfBirth;
        this.startDay = startDay;
        this.endDay = endDay;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearsOfWork() {
        return yearsOfWork;
    }

    public void setYearsOfWork(int yearsOfWork) {
        this.yearsOfWork = yearsOfWork;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
