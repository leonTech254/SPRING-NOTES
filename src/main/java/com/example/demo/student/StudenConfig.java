//package com.example.demo.student;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Configuration
//public class StudenConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentsRespostory respostory)
//    {
//        return args -> {
//            Student martin=new Student(
//                    "martin",
//                    "martin@gmail.com",
//                    LocalDate.of(2023,5,2)
//            );
//            Student leon=new Student(
//
//                    "leon",
//                    "leon@gmail.com",
//                    LocalDate.of(2000,5,2)
//            );
//            respostory.saveAll(
//                    List.of(martin,leon)
//            );
//        };
//
//    }
//}
