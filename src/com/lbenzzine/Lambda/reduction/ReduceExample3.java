package com.lbenzzine.Lambda.reduction;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample3 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Dave", 3.5F));
        list.add(new Student("Ryan", 3.2F));
        list.add(new Student("Iyan", 2.7F));
        list.add(new Student("Ray", 2.9F));

        // Code with parallel Stream
        Double sumOfGrades = list.parallelStream()
                .map(Student::getAverageGrade)
                //Identity is set to 0.0D , so if stream was empty sum would be 0 , otherwise
                //stream's sum is returned
                .reduce(0.0D,(temp, number) -> temp + number, Double::sum);


        System.out.printf("The Class's sum of grades average is  %s%n", String.format("%1$,.2f", sumOfGrades));
    }
}
