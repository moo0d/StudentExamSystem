package com.example;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "grade", nullable = false)
    private int grade; // Grades will be on a scale of 1-5

    @Temporal(TemporalType.DATE)
    private java.util.Date savedDate;

    public Exam() {}

    public Exam(Student student, int grade) {
        this.student = student;
        this.grade = grade;

    }

    public Long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getSavedDate() {
        return savedDate;
    }

    public void setSavedDate(Date savedDate) {
        this.savedDate = savedDate;
    }
}