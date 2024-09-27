package com.application.myFirstApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.DayOfWeek;
import java.util.Date;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Course course;
    private Date dateOfLesson;
    private DayOfWeek dayOfWeek;
    private String timeOfLesson;

    public Lesson() {
    }

    public Lesson(int id, Course course, Date dateOfLesson, DayOfWeek dayOfWeek, String timeOfLesson) {
        this.id = id;
        this.course = course;
        this.dateOfLesson = dateOfLesson;
        this.dayOfWeek = dayOfWeek;
        this.timeOfLesson = timeOfLesson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getDateOfLesson() {
        return dateOfLesson;
    }

    public void setDateOfLesson(Date dateOfLesson) {
        this.dateOfLesson = dateOfLesson;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getTimeOfLesson() {
        return timeOfLesson;
    }

    public void setTimeOfLesson(String timeOfLesson) {
        this.timeOfLesson = timeOfLesson;
    }
}
