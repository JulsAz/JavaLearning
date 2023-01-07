package ru.sbrf.gitcommit.week1;

public class Person {

    private String name;
    private String taxId;

    public Person () {}

    public Person (String name, String taxId) {
        this.name = name;
        this.taxId = taxId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                '}';
    }
}
