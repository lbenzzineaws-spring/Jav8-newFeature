package com.lbenzzine.Lambda;


import java.util.ArrayList;
        import java.util.List;
import java.util.OptionalDouble;
import static java.lang.String.format;

public class ReferenceGetter {
    public int getLength(String str) {
        return str.length();
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Dave", 3.5F));
        list.add(new Student("Ryan", 3.2F));
        list.add(new Student("Iyan", 2.7F));
        list.add(new Student("Ray", 2.9F));
        // Code without using method reference
        OptionalDouble gradeAverage = list.stream()
                .mapToDouble(stud -> stud.getAverageGrade())
                .average();

        // Code with method reference
        OptionalDouble gradeAverage1 = list.stream()
                .mapToDouble(Student::getAverageGrade)
                .average();

        System.out.printf("The Class average is  %s%n", String.format("%1$,.2f", gradeAverage1.getAsDouble()));
    }
}


