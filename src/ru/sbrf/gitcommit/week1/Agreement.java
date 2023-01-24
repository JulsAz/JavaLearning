package ru.sbrf.gitcommit.week1;

import ru.sbrf.gitcommit.week4.AgreementStatus;

abstract public class Agreement {

    private String reference;
    private Person applicant;
    private Money amount;
    private AgreementStatus agreementStatus;

    public Agreement() {
    }

    public Agreement(AgreementStatus agreementStatus) {
        this.agreementStatus = agreementStatus;
    }

    public Agreement(String reference, Person applicant, Money amount) {
        this.reference = reference;
        this.applicant = applicant;
        this.amount = amount;
    }


    public String getReference() {
        return reference;
    }

    public Person getApplicant() {
        return applicant;
    }

    public Money getAmount() {
        return amount;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setApplicant(Person applicant) {
        this.applicant = applicant;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public AgreementStatus getAgreementStatus() {
        return agreementStatus;
    }

    public void setAgreementStatus(AgreementStatus agreementStatus) {
        this.agreementStatus = agreementStatus;
    }


    @Override
    public String toString() {
        return "Agreement{" +
                "reference='" + reference + '\'' +
                ", applicant=" + applicant +
                ", amount=" + amount +
                ", agreementStatus=" + agreementStatus +
                '}';
    }
}
