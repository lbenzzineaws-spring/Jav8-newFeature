package com.lbenzzine;


        public class MyClass implements Animal {
        public static void main(String [] args){
            MyClass elephant = new MyClass();
            elephant.animalSound();
            //elephant.sleep();
            Animal.sleep();//sleep method cannot be overridden and will be called using the interface

        }
        @Override
        public void animalSound() {
            System.out.println("The cow says: Moo Moo");
        }
        }

