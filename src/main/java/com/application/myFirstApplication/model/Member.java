package com.application.myFirstApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String jmbg;
    private Date dateOfBirth;
    private Education education;
    private Date startDay;
    private Date endDay;
    private int numbersOfAttendance;
    private int getNumbersOfAbsences;
    private Course course;


    public Member() {
    }

    public Member(int id, String firstName, String lastName, String jmbg, Date dateOfBirth, Education education, Date startDay, Date endDay, int numbersOfAttendance, int getNumbersOfAbsences, Course course) {
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
        this.course = course;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
