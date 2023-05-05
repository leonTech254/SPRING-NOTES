package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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


    public List<Student> addNewStudent(Student student) throws IllegalAccessException {
        Optional <Student> studentByEmail=studentsRespostory.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent())
        {
            throw  new IllegalAccessException("email taken");
        }else
        {
            studentsRespostory.save(student);

        }
    System.out.println(student);
    return  List.of(student);

    }
}
