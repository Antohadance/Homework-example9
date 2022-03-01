package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("level easy");
        Book firstBook = new Book("green Mile", new Author("Stephan", "King"), 1997);
        Book secondBook = new Book("Dandelion Wine", new Author("Ray", "Bradbury"), 1957);
        firstBook.setPublishYear(1960);
        System.out.println(firstBook.setPublishYear());
    }
}
