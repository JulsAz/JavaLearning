package ru.sbrf.gitcommit.week4;

public class Loop {
    static int number;
    static int iteration;

    public static void whileLoopEven() {
        number = 0;
        iteration = 0;
        while (number <= 10) {
            iteration++;
            System.out.println(iteration % 3 == 0 ? number + "!" : number);
            number += 2;
        }

    }


    public static void whileLoopOdd() {
        number = 9;
        iteration = 0;
        while (number >= 0) {
            iteration++;
            if (iteration % 3 == 0) {
                System.out.println(number + "!");
            } else {
                System.out.println(number);
            }
            number -= 2;
        }
    }

    public static void forLoopEven() {
        iteration = 0;
        for (int i = 0; i <= 10; i = i + 2) {
            iteration++;
            System.out.println(iteration % 3 == 0 ? i + "!" : i);
        }
    }


    public static void forLoopOdd() {
        iteration = 0;
        for (int i = 9; i >= 0; i = i - 2) {
            iteration++;
            if (iteration % 3 == 0) {
                System.out.println(i + "!");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void doWhileLoopEven() {
        number = 0;
        iteration = 0;
        do {
            iteration++;
            System.out.println(iteration % 3 == 0 ? number + "!" : number);
            number += 2;
        } while (number <= 10);
    }

    public static void doWhileLoopOdd() {
        number = 9;
        iteration = 0;
        do {
            iteration++;
            if (iteration % 3 == 0) {
                System.out.println(number + "!");
            } else {
                System.out.println(number);
            }
            number -= 2;
        } while (number >= 0);
    }
}
