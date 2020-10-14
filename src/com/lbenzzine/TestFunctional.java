package com.lbenzzine;

public class TestFunctional implements Functional {
    public static void main(String [] args){
       TestFunctional test = new TestFunctional();
       test.doSomething();

    }
    @Override
    public void doSomething() {
        System.out.println("the functional interface allow only one method");
    }

    }

