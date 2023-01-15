package ru.sbrf.gitcommit.week4;

import java.util.Scanner;

public class Age {

    public static void getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты пошел в школу");
                break;
            case 18:
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("нет условия");
        }
    }
}
