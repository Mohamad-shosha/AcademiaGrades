package com.shosha404.springmvc.service;

import com.shosha404.springmvc.dao.StudentRepository;
import com.shosha404.springmvc.models.student.CollegeStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void createStudent(String firstName, String lastName, String email) {
        CollegeStudent collegeStudent = new CollegeStudent(firstName, lastName, email);
        collegeStudent.setId(0);
        studentRepository.save(collegeStudent);
    }

    public boolean checkIfStudentExists(Integer id) {
        Optional<CollegeStudent> collegeStudent = studentRepository.findById(id);
        if (collegeStudent.isPresent()) {
            return true;
        } else {
            return false;
        }
    }
}
