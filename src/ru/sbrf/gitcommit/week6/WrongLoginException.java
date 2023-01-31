package ru.sbrf.gitcommit.week6;

//5. WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
// второй принимает сообщение исключения и передает его в конструктор класса Exception.

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String description) {
        super(description);
    }
}
