package ru.sbrf.gitcommit.week1;

public class RealtyAgreement extends Agreement{

    private RealtyObject realtyObject;

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
