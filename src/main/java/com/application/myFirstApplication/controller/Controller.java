package com.application.myFirstApplication.controller;

import com.application.myFirstApplication.model.*;
import com.application.myFirstApplication.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
@CrossOrigin

public class Controller {

    @Autowired
    private ServiceInterface serviceInterface;

    //director
    @GetMapping("/login")
    public Director getDirector() {
        return null;
    }

    //member
    @PostMapping("/saveMember")
    public String saveMember(@RequestBody Member member){
        serviceInterface.addMember(member);
        return "Member is saved";
    }

    @GetMapping("/getAllMembers")
    public List<Member> getAllMember(){
        return serviceInterface.getAllMembers();
    }

    //course
    @PostMapping("/saveCourse")
    public String saveCourse(@RequestBody Course course){
        serviceInterface.saveCourse(course);
        return "Course is saved";
    }

    @GetMapping("/getAllCourse")
    public List<Course> getAllCourse(){
        return serviceInterface.getAllCourses();
    }

    //professor
    @PostMapping("/saveProfessor")
    public String saveProfessor(@RequestBody Professor professor){
        serviceInterface.addProfessor(professor);
        return "Professor is saved";
    }

    @GetMapping("/getAllProfessor")
    public List<Professor> getAllProfessor(){
        return serviceInterface.getAllProfessors();
    }

    //attendance
    @PostMapping("/addAttendance")
    public String saveAttendance(@RequestBody Attendance attendance){
        serviceInterface.addAttendance(attendance);
        return "Attendance is saved";
    }

    @GetMapping("/getAllAttendance")
    public List<Attendance> getAllAttendance(){
        return serviceInterface.getAllAttendance();
    }

    //group
    @PostMapping("addGroup")
    public String saveGroup(@RequestBody CourseGroup courseGroup){
        serviceInterface.addGroup(courseGroup);
        return "Group is saved";
    }

    @GetMapping("/getAllGroups")
    public List<CourseGroup> getAllGroup(){
        return serviceInterface.getAllCourseGroup();
    }
}
