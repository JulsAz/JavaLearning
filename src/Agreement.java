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

    @Override
    public String toString() {
        return "Agreement{" +
                "reference='" + reference + '\'' +
                ", applicant=" + applicant +
                ", amount=" + amount +
                '}';
    }
}
