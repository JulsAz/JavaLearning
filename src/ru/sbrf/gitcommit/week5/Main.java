package ru.sbrf.gitcommit.week5;

public class Main {

    public static void main(String[] args) {

        //      Book book = new Book();
        //      Magazine magazine = new Magazine();
        //  Printable [] printables = {book, magazine};

        Printable[] printables = {
                new Book(),
                new Magazine()
        };

        // for (Тип_перебираемых_данных название_переменной : массив_или_коллекция)
        for (Printable printable : printables) {
            printable.print();
        }
        //Создать массив типа Printable, который будет содержать книги и журналы.
        //В цикле пройти по массиву и вызвать метод print() для каждого объекта. "
        System.out.println(max(11, 33));
    }

    //Рядом с методом main создать статический метод max(T t1, T t2) возвращающий максимальное из двух Т. Вывести в консоль максимальное значение"

    public static <T extends Comparable> T max(T t1, T t2) {
        return t1.compareTo(t2) > 0 ? t1 : t2;
    }


}


