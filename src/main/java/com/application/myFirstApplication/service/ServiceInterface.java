package com.application.myFirstApplication.service;

import com.application.myFirstApplication.model.*;

import java.util.List;

public interface ServiceInterface {

    //director
    public Director getOneDirector();

    //member
    public Member addMember(Member member);
    public List<Member> getAllMembers();

    //course
    public Course saveCourse(Course course);
    public List<Course> getAllCourses();

    //professor
    public Professor addProfessor(Professor professor);
    public List<Professor> getAllProfessors();

    //attendance
    public Attendance addAttendance(Attendance attendance);
    public List<Attendance> getAllAttendance();

    //group
    public CourseGroup addGroup(CourseGroup courseGroup);
    public List<CourseGroup> getAllCourseGroup();

}
