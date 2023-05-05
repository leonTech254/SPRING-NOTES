package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {
    public  final  StudentsRespostory studentsRespostory;
    @Autowired
    public StudentService(StudentsRespostory studentsRespostory) {
        this.studentsRespostory = studentsRespostory;
    }

    public List<Student> getStudents()

    {
        return studentsRespostory.findAll();

    }




}
