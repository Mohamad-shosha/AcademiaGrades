package com.shosha404.springmvc;

import com.shosha404.springmvc.dao.StudentRepository;
import com.shosha404.springmvc.models.student.CollegeStudent;
import com.shosha404.springmvc.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("/application.properties")
public class StudentAndGradeServiceTest {
    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentDao;

    @Test
    public void createStudentService() {
        studentService.createStudent("Mohamed", "shosha", "moshosha267@gmail.com");
        CollegeStudent collegeStudent = studentDao.findByEmailAddress("moshosha267@gmail.com");
        Assertions.assertEquals("moshosha267@gmail.com", collegeStudent.getEmailAddress());
    }

}
