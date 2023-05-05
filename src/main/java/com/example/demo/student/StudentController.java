package com.example.demo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> getStudent()
    {
        return  studentService.getStudents();
    }

//    adding new student
    @PostMapping("/addStudent")
    public  List<Student>  RegisterNewStudent(@RequestBody Student student) throws IllegalAccessException {
       return studentService.addNewStudent(student);


    }

}
