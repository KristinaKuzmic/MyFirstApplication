package com.application.myFirstApplication.model;

import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private CourseGroup courseGroup;

    private LocalDate dateOfLesson;
    private DayOfWeek dayOfWeek;
    private String timeOfLesson;

    @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL)
    private List<Attendance> attendanceList;


    public Lesson() {
    }

    public Lesson(int id, CourseGroup courseGroup, LocalDate dateOfLesson, DayOfWeek dayOfWeek, String timeOfLesson, List<Attendance> attendanceList) {
        this.id = id;
        this.courseGroup = courseGroup;
        this.dateOfLesson = dateOfLesson;
        this.dayOfWeek = dayOfWeek;
        this.timeOfLesson = timeOfLesson;
        this.attendanceList = attendanceList;
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public void setAttendanceList(List<Attendance> attendanceList) {
        this.attendanceList = attendanceList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CourseGroup getGroup() {
        return courseGroup;
    }

    public void setGroup(CourseGroup courseGroup) {
        this.courseGroup = courseGroup;
    }

    public LocalDate getDateOfLesson() {
        return dateOfLesson;
    }

    public void setDateOfLesson(LocalDate dateOfLesson) {
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
