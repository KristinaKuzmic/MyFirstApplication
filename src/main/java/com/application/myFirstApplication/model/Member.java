package com.application.myFirstApplication.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String jmbg;
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Education education;

    private LocalDate startDay;
    private LocalDate endDay;
    private int numbersOfAttendance;
    private int getNumbersOfAbsences;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private CourseGroup courseGroup;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Attendance> attendanceList;

    public Member() {
    }

    public Member(int id, String firstName, String lastName, String jmbg, LocalDate dateOfBirth, Education education, LocalDate startDay, LocalDate endDay, int numbersOfAttendance, int getNumbersOfAbsences, CourseGroup courseGroup, List<Attendance> attendanceList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jmbg = jmbg;
        this.dateOfBirth = dateOfBirth;
        this.education = education;
        this.startDay = startDay;
        this.endDay = endDay;
        this.numbersOfAttendance = numbersOfAttendance;
        this.getNumbersOfAbsences = getNumbersOfAbsences;
        this.courseGroup = courseGroup;
        this.attendanceList = attendanceList;
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

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
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

    public int getNumbersOfAttendance() {
        return numbersOfAttendance;
    }

    public void setNumbersOfAttendance(int numbersOfAttendance) {
        this.numbersOfAttendance = numbersOfAttendance;
    }

    public int getGetNumbersOfAbsences() {
        return getNumbersOfAbsences;
    }

    public void setGetNumbersOfAbsences(int getNumbersOfAbsences) {
        this.getNumbersOfAbsences = getNumbersOfAbsences;
    }

    public CourseGroup getGroup() {
        return courseGroup;
    }

    public void setGroup(CourseGroup courseGroup) {
        this.courseGroup = courseGroup;
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public void setAttendanceList(List<Attendance> attendanceList) {
        this.attendanceList = attendanceList;
    }
}
