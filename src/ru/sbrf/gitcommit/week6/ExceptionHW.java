package ru.sbrf.gitcommit.week6;

public class ExceptionHW {

    //"1. Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//2. Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//3. Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//4. Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов.
// Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
// 6. Обработка исключений проводится внутри метода.
//7. Используем multi-catch block.
//8. Метод возвращает true, если значения верны или false в другом случае. "

    public static boolean validateParameters(String login, String password, String confirmPassword) {

        try {
            if (!login.matches("\\w+") || login.length() >= 20) { //более короткий вариант "\\w - буквенно-цифровой символ или знак подчёркивания", чем в поле с паролем
                throw new WrongLoginException("Невалидный логин");
            }
            if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                throw new WrongPasswordException("Невалидный пароль");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
