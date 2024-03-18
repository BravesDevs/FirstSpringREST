package com.example.firstspringapp.student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            allocationSize = 1,
            sequenceName = "student_sequence",
            name = "student_sequence"
    )
    @GeneratedValue(
            generator = "student_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String name;
    private int age;
    private String email;

    private LocalDate dob;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }

    public Student() {
    }

    public Student(Long id, String name, int age, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;
    }

    public Student(String name, int age, String email, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;
    }

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;

    }
}
