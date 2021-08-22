package com.example.backend.controller;


import com.example.backend.model.Student;
import com.example.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*Mache aus deiner Klasse einen Kontroller*/
@RestController
/*Gib ihm request mapping mit*/
@RequestMapping("/api/student")


public class StudentController {
    /*mit diesen drei Zeilen haben wir unsere api geschrieben.*/

    StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> addStudent(){
        return studentService.getList();
    }

}
