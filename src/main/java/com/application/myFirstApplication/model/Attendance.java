package com.application.myFirstApplication.model;

import jakarta.persistence.*;


@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean memberAttendance;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    public Attendance() {
    }

    public Attendance(int id, boolean memberAttendance, Group group, Lesson lesson, Member member) {
        this.id = id;
        this.memberAttendance = memberAttendance;
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
