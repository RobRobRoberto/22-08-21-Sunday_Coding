package com.example.backend.model;

import java.util.Objects;

public class Student {

    String matNumber;
    String name;


    public Student(String matNumber, String name) {
        this.matNumber = matNumber;
        this.name = name;
    }


    public String getMatNumber() {
        return matNumber;
    }

    public void setMatNumber(String matNumber) {
        this.matNumber = matNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(matNumber, student.matNumber) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matNumber, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "matNumber='" + matNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
