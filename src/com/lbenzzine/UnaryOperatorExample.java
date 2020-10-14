package com.lbenzzine;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        Book book = new Book();
        UnaryOperator<Book> operator = (p) -> {
            p.title = "Java 8 in action";
            p.numberPages = 134;
            return p;
        };

        operator.apply(book);
        System.out.println("Book title is: " + book.getTitle() +  " # And # " + " Book number of pages is: " + book.getNumberPages());
    }
}

class Book {
    String title;
    int numberPages;

    Book() {
    }

    Book(String title, int numbrePages) {
        this.title = title;
        this.numberPages = numbrePages;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getNumberPages() { return numberPages; }

    public void setNumberPages(int numberPages) { this.numberPages = numberPages; }
}
