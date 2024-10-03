package com.application.myFirstApplication.service;


import com.application.myFirstApplication.model.*;
import com.application.myFirstApplication.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements ServiceInterface{

    //director
    @Autowired
    private DirectorRepository directorRepository;

    @Override
    public Director getOneDirector(String email){
        return directorRepository.findByEmail(email);
    }

    //member
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    //course
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAllCouse();
    }

    //professor

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public Professor addProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    @Override
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    //attendance

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public Attendance addAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    //group

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public CourseGroup addGroup(CourseGroup courseGroup) {
        return groupRepository.save(courseGroup);
    }

    @Override
    public List<CourseGroup> getAllCourseGroup() {
        return groupRepository.findAll();
    }

    //lesson

    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public List<Lesson> addLessons(List<Lesson> lessons) {
        return lessonRepository.saveAll(lessons);
    }

    @Override
    public List<Lesson> getLessons() {
        return lessonRepository.findAll();
    }

    @Override
    public Lesson addLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }
}
