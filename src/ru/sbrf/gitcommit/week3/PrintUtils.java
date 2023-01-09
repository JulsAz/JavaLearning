package ru.sbrf.gitcommit.week3;

public class PrintUtils {

    public static void print(int number) {
        System.out.println(number);
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printString(String text) {
        //Распечатать последний символ строки. Используем метод String.charAt() и length()
        System.out.println(text.charAt(text.length() - 1));
        //Проверить, заканчивается ли ваша строка подстрокой “!”. Используем метод String.endsWith().
        System.out.println(text.endsWith("!"));
        //Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(text.startsWith("I like"));
        //Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(text.contains("Java"));
        //Найти позицию подстроки “Java” в строке “I like Java!”.
        System.out.println(text.indexOf("Java"));
        //Преобразуйте строку к верхнему регистру.
        System.out.println(text.toUpperCase());
        //Преобразуйте строку к нижнему регистру.
        System.out.println(text.toLowerCase());
        //Вырезать строку Java c помощью метода String.substring()."
        System.out.println(text.substring(text.indexOf("J"), text.indexOf("!")));
        //развернуть строку
        System.out.println(new StringBuilder(text).reverse());

    }

}
