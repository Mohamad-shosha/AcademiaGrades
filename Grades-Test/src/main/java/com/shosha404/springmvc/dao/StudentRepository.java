package com.shosha404.springmvc.dao;

import com.shosha404.springmvc.models.student.CollegeStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<CollegeStudent, Integer> {
    CollegeStudent findByEmailAddress(String mail);
}