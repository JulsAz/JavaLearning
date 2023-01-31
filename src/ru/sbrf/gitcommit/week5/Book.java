package ru.sbrf.gitcommit.week5;

public class Book implements Printable {
    //Определить класс Book, реализующий интерфейс Printable.

    @Override
    public void print() {
        System.out.println(Book.class.getName());
    }
}
