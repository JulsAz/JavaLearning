package ru.sbrf.gitcommit.week5;

import ru.sbrf.gitcommit.week1.RealtyAgreement;

public class RegistrationOperation extends Operation<RealtyAgreement> {
    //Сделать класс RegistrationOperation, типизированный недвижкой, в нем сделать метод createNewAgreement возвращающий новый агримент.

    public RealtyAgreement createNewAgreement() {
        return new RealtyAgreement();
    }
}
