package ru.sbrf.gitcommit.week1;

import ru.sbrf.gitcommit.service.AgreementService;
import ru.sbrf.gitcommit.week4.AgreementStatus;

public class Main {
    public static void main(String[] args) {

        Money amount1 = new Money(1000, "RUB");
        Person applicant1 = new Person("OOO Фора", "123");

        Agreement firstAgreement = new Agreement("ROP00000001", applicant1, amount1);
        Agreement secondAgreement = new Agreement("ROP00000002", new Person("ООО Потеряшка", "567"),
                new Money(1, "USD"));

        System.out.println(firstAgreement);
        System.out.println(secondAgreement);

        // enam part
        //В классе Main методе main создаем Agreement со статусом, создаем сервис, передаем методу close сервиса созданный агримент"
        Agreement thirdAgreement = new Agreement(AgreementStatus.CLOSED);
        AgreementService agreementService = new AgreementService();
        agreementService.close(thirdAgreement);

    }
}
