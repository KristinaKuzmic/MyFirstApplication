package com.application.myFirstApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean memberAttendance;
    private Course course;
    private Lesson lesson;
    private Member member;

    public Attendance() {
    }

    public Attendance(int id, boolean memberAttendance, Course course, Lesson lesson, Member member) {
        this.id = id;
        this.memberAttendance = memberAttendance;
        this.course = course;
        this.lesson = lesson;
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMemberAttendance() {
        return memberAttendance;
    }

    public void setMemberAttendance(boolean memberAttendance) {
        this.memberAttendance = memberAttendance;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
