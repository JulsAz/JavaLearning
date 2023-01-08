package ru.sbrf.gitcommit.week1;

public class Agreement {

    private String reference;
    private Person applicant;
    private Money amount;

    public  Agreement () {}

    public Agreement ( String reference, Person applicant, Money amount) {
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

    @Override
    public String toString() {
        return "Agreement{" +
                "reference='" + reference + '\'' +
                ", applicant=" + applicant +
                ", amount=" + amount +
                '}';
    }
}
