package ru.sbrf.gitcommit.week2;

public class Main {
    public static void main(String[] args) {
        String newString = "Новая строка";

        Class stringClass = newString.getClass();
        System.out.println(stringClass.getName());
    }
}
