package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class BackUp {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/ccccc")
    public List<Student> hello()
    {
        return List.of(new Student(
                1L,
                "martin",
                "leon@gmail.com",
                LocalDate.of(2023,5,2),
                23
        ));

    }

}
