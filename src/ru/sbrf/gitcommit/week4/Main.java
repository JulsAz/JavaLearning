package ru.sbrf.gitcommit.week4;

import ru.sbrf.gitcommit.week4.extratask.WarShips;

public class Main {
    public static void main(String[] args) {
        System.out.println("cycle While even");
        Loop.whileLoopEven();
        System.out.println();

        System.out.println("cycle While odd");
        Loop.whileLoopOdd();
        System.out.println();

        System.out.println("cycle For even");
        Loop.forLoopEven();
        System.out.println();

        System.out.println("cycle For odd");
        Loop.forLoopOdd();
        System.out.println();

        System.out.println("cycle Do while even");
        Loop.doWhileLoopEven();
        System.out.println();

        System.out.println("cycle Do while odd");
        Loop.doWhileLoopOdd();
        System.out.println();

        //задание switch
        //Age.getAge();
        System.out.println();

        //Animal.getAnimal();
        System.out.println();

        //задание enam - в мейн недели 1
        //arreys: В main создать массив циферок от 5 до 10. С помощью цикла вывести их в консоль

        int[] numbers = {5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        WarShips.findChar();
    }
}
