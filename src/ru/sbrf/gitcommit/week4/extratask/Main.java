package ru.sbrf.gitcommit.week4.extratask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // В методе main сделать цикл, работающий пока есть хотябы один символ 'O' в массиве.
// Вцикле считываем из консоли x и y. При попадании меняем символ. Выводим поле в консоль"
        while (WarShips.findChar()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение X :");
            int x = scanner.nextInt();
            System.out.println("Введите значение Y");
            int y = scanner.nextInt();
            if (WarShips.field[x][y] == 'O') {
                WarShips.field[x][y] = 'X';
                WarShips.printField();
            } else {
                //WarShips.field[x][y] = '+';
                System.out.println("Мимо");
            }

        }
    }

}
