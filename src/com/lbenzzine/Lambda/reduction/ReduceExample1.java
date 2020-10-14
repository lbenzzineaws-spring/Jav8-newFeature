package com.lbenzzine.Lambda.reduction;

import java.util.*;

public class ReduceExample1 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Dave", 3.5F));
        list.add(new Student("Ryan", 3.2F));
        list.add(new Student("Iyan", 2.7F));
        list.add(new Student("Ray", 2.9F));

        // Code with method reference
        Double sumOfGrades = list.stream()
                                .map(Student::getAverageGrade)
                                .reduce(8.0D,(temp, number) -> temp + number);


        System.out.printf("The Class's sum of grades average is  %s%n", String.format("%1$,.2f", sumOfGrades));
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
