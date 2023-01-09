package ru.sbrf.gitcommit.week3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        PrintUtils.print("hello");
        PrintUtils.print(1);
        System.out.println();

        PrintUtils.printString("I like Java!");
        System.out.println();

        Obertka obertka = new Obertka();
        System.out.println(obertka);
        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Текущая дата - " + LocalDate.now().format(formatter));
        System.out.println("Дата 4 недели назад - " + LocalDate.now().minusWeeks(4).format(formatter));
        System.out.println("Текущий месяц - " + LocalDate.now().getMonth());


    }
}