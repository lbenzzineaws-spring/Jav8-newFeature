package com.lbenzzine.Lambda;


import java.util.ArrayList;
import java.util.List;

public class ConstructorReference {
    public int getLength(String str) {
        return str.length();
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Ryan");
        list.add("Iyan");
        list.add("Ray");
        // Code without using method reference
        list.stream()
                .map(name -> new Student(name))
                .forEach(name -> System.out.println(name));
        System.out.println("================== Same output");
        // Code with method reference
        list.stream().map(Student::new)
                .forEach(System.out::println);
    }
}

class Student {
    String name;
    double averageGrade;

    Student(String name) {
        this.name = name;
    }

    Student(String name, float averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
