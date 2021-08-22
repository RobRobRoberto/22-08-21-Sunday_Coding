package com.example.backend.repository;

import com.example.backend.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;


@Repository
public class StudentRepository {
    /*Wenn ich etwas in der Db ändern will, dann nutze ich die hier stehenden Funktionen*/
    /*Persistence Logik*/

    List<Student> studentDb = new ArrayList<>();



    public void addStudent(Student student){
        studentDb.add(student);

    }


    public List<Student> listStudent(){
        return studentDb;
    }

    /*Folgende funktionen wären eigentlich zusätzlich noch geschrieben:
    * getStudentById
    * setStudent
    * deleteStudent
    * CRUD Operations*/





}
