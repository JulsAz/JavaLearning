package ru.sbrf.gitcommit.week1;

import ru.sbrf.gitcommit.week4.AgreementStatus;

public class RealtyAgreement extends Agreement {

    private RealtyObject realtyObject;


    public RealtyAgreement(String reference, Person applicant, Money amount) {
        super(reference, applicant, amount);
    }

    public RealtyAgreement(AgreementStatus agreementStatus) {
        super(agreementStatus);
    }

    public RealtyObject getRealtyObject() {
        return realtyObject;
    }

    public void setRealtyObject(RealtyObject realtyObject) {
        this.realtyObject = realtyObject;
    }

    @Override
    public String toString() {
        return "RealtyAgreement{" +
                "realtyObject=" + realtyObject +
                '}';
    }
}
