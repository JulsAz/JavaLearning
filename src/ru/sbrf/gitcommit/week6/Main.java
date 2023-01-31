package ru.sbrf.gitcommit.week6;

public class Main {
    public static void main(String[] args) {
        //Сделать последний пример из видео, но так, чтобы getEmail возвращал просто строку
        Person sergey = new Person("Сергей", "sergey@mail.ru");
        String email = sergey
                .getEmail()
                .orElse("Почты нет");
        System.out.println(email);

        boolean result = ExceptionHW.validateParameters("qwe123", "asf", "asf");
        System.out.println(result);
    }
}


