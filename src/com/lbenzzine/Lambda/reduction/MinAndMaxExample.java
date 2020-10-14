package com.lbenzzine.Lambda.reduction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinAndMaxExample {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Dave", 3.5F));
        list.add(new Student("Ryan", 3.2F));
        list.add(new Student("Iyan", 2.7F));
        list.add(new Student("Ray", 2.9F));

        // Getting min grade Average for class
        Optional<Double> minOfGrades = list.stream()
                .map(Student::getAverageGrade)
                .min(Double::compareTo);

        System.out.printf("The Class's min grades average is  %s%n", String.format("%1$,.2f", minOfGrades.get()));
        System.out.println("=========================");

        // Getting min grade Average for class
        Optional<Double> maxOfGrades = list.stream()
                .map(Student::getAverageGrade)
                .max(Double::compareTo);

        System.out.printf("The Class's max grades average is  %s%n", String.format("%1$,.2f", maxOfGrades.get()));
    }
}
