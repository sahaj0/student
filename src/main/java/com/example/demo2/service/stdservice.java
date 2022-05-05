package com.example.demo2.service;

import com.example.demo2.entity.Student;

import java.util.List;

public interface stdservice {
    public Student savestudent(Student std);

   public List<Student> fetch();

    Student fetchid(Long id);

    String delbyid(Long id);

    Student updatebyid(Long id, Student std);

    List<Student> fetchb(String branch);
}
