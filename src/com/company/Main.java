package com.company;

public class Main {

    public static void main(String[] args) {
    Author stephanKing = new Author("Стивен","Кинг");
        Book firstBook = new Book("Зеленая миля", new Author("Стивен", "Кинг"), 1997);
        Book secondBook = new Book("Вино из одуванчиков", new Author("Рэй", "Брэдбери"), 1957);
        firstBook.setPublishYear(1960);
        System.out.println(firstBook.getPublishYear());

        System.out.println("Авторы:");
        Author stephenKing = new Author("Стивен","Кинг");
        Author stephanKing2 = new Author("Стивен","Кинг");
        Author rayBradbury = new Author("Рэй","Бредбэри");
        System.out.println("Автор копирует: " + stephenKing.equals(stephanKing2));
        System.out.println("Авторские копии равны: " + (stephenKing.hashCode() == stephanKing2.hashCode()));
        System.out.println("Авторы равны: " + stephenKing.equals(rayBradbury));
        System.out.println("Авторы равны по хэш-коду: " + (stephenKing.hashCode() == rayBradbury.hashCode()));

        System.out.println(stephenKing);
        System.out.println(rayBradbury);

        System.out.println("++++++++++++++++++++++");

        System.out.println("Книги:");
        Book theShining = new Book("Сияние", stephenKing, 1977);
        Book theShining2 = new Book("Сияние", stephenKing, 1977);
        Book fahrenheit451 = new Book("451 градус по Фаренгейту", rayBradbury, 1953);
        System.out.println("Экземпляры книг равны: " + theShining.equals(theShining2));
        System.out.println("Копии книг равны по хэш-коду: " + (theShining.hashCode() == theShining2.hashCode()));
        System.out.println("Книги равны: " + theShining.equals(fahrenheit451));
        System.out.println("Книги равны по хеш-коду: " + (theShining.hashCode() == fahrenheit451.hashCode()));
        System.out.println(theShining);
        System.out.println(fahrenheit451);
    }
}
