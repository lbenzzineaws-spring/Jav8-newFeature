package com.lbenzzine;


import java.util.function.Predicate;

public class PredicateExample {

    static boolean isPersonOldEnoughToVote(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }


    public static void main (String args[]){
        Person person = new Person("Alex", 23);
        // Created a predicate. It returns true if age is greater than 18.
        Predicate<Person> predicate = p -> p.age > 18;

        boolean eligible = isPersonOldEnoughToVote(person , predicate);

        System.out.println("Person is old enough to vote: " + eligible);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}