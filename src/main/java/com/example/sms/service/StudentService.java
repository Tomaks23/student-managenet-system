package com.example.sms.service;

import com.example.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}
