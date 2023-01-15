package ru.sbrf.gitcommit.week4;

import java.util.Scanner;

public class Animal {
    public static void getAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите животное:");
        String animal = scanner.nextLine();
        switch (animal) {
            case "кот":
                System.out.println("Кот говорит \"Мяу\"");
                break;
            case "собака":
                System.out.println("Собака говорит \"Гав\"");
                break;
            case "корова":
                System.out.println("Корова говорит \"Муу\"");
                break;
            default:
                System.out.println("животного в списке нет");
        }

    }
}
