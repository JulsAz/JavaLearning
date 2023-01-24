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
    }
}


