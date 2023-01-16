package ru.sbrf.gitcommit.week4.extratask;

public class WarShips {
    //Создать класс WarShips. В нем создать массив char 10х10.
    // где пустое поле - ' ', палуба - 'O', подбитая палуба - 'X'
    // сделать статический метод, проверяющий что в массиве есть хотябы один символ 'O'.

    static char[][] field = {
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', 'O', '-', '-', 'O', '-', '-', 'O', 'O', 'O'},
            {'-', 'O', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', 'O', 'O', 'O', '-', '-', 'O', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', 'O', '-'},
            {'-', '-', '-', '-', '-', 'O', '-', '-', '-', '-'},
            {'-', '-', 'O', 'O', '-', 'O', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', 'O', '-', 'O', '-', '-'},
            {'-', 'O', '-', '-', '-', 'O', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', 'O', '-'}
    };

    public static boolean findChar() {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}

