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
    @GetMapping("/login/{email}")
    public Director getDirector(@PathVariable String email) {
        return serviceInterface.getOneDirector(email);
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

    //lesson

    @PostMapping("/addLessons")
    public String saveLessons(@RequestBody List<Lesson> lessons){
        serviceInterface.addLessons(lessons);
        return "Lessons are saved";
    }

    @PostMapping("/addLesson")
    public String saveLesson(@RequestBody Lesson lesson){
        serviceInterface.addLesson(lesson);
        return "Lesson is saved";
    }

    @GetMapping("/getLessons")
    public List<Lesson> getLessons(){
        return  serviceInterface.getLessons();
    }

}
