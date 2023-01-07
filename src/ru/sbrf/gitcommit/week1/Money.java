package ru.sbrf.gitcommit.week1;

public class Money {

    private long amount;
    private String currency;

    public Money () {
    }
    public Money (long amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
