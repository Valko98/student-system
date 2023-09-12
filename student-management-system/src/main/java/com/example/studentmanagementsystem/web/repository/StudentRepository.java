package com.example.studentmanagementsystem.web.repository;

import com.example.studentmanagementsystem.web.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
