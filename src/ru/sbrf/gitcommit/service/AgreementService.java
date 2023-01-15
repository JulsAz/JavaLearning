package ru.sbrf.gitcommit.service;

import ru.sbrf.gitcommit.week1.Agreement;
import ru.sbrf.gitcommit.week4.AgreementStatus;

//3. В пакете service создать AgreementService. У него создать метод void close(Agreement agreement) который
// устанавливает статус CLOSED и в зависимости от статуса выводит в консоль: “удаляем черновик”, “закрываем аккредитив”, “аккредитив закрыт”

public class AgreementService {
    public void close(Agreement agreement) {
        switch (agreement.getAgreementStatus()) {
            case DRAFT:
                System.out.println("удаляем черновик");
                break;
            case ACTIVE:
                System.out.println("закрываем аккредитив");
                break;
            case CLOSED:
                System.out.println("аккредитив закрыт");
                break;
        }
        agreement.setAgreementStatus(AgreementStatus.CLOSED);
    }
}
