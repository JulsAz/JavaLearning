package ru.sbrf.gitcommit.week1;

import ru.sbrf.gitcommit.week1.Agreement;
import ru.sbrf.gitcommit.week4.AgreementStatus;

public class ConstructionAgreement extends Agreement {

    private RealtyObject realtyObject;

    public ConstructionAgreement(AgreementStatus agreementStatus, RealtyObject realtyObject) {
        super(agreementStatus);
        this.realtyObject = realtyObject;
    }


    public RealtyObject getRealtyObject() {
        return realtyObject;
    }

    public void setRealtyObject(RealtyObject realtyObject) {
        this.realtyObject = realtyObject;
    }


}
