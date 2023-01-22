package ru.sbrf.gitcommit.week5;

public class Magazine implements Printable{
    //Определить класс Magazine, реализующий интерфейс Printable.

    @Override
    public void print() {
        System.out.println(Magazine.class.getName());

    }
}
