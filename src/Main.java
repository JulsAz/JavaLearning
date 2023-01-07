public class Main {
    public static void main(String[] args) {
        String newString = "Новая строка";

        Class stringClass = newString.getClass();
        System.out.println(stringClass.getName());

        Money amount1 = new Money(1000, "RUB");
        Person applicant1 = new Person("OOO Фора", "123");

        Agreement firstAgreement = new Agreement("ROP00000001", applicant1, amount1);
        Agreement secondAgreement = new Agreement("ROP00000002", new Person("ООО Потеряшка", "567"),
                new Money(1, "USD"));

        System.out.println(firstAgreement);
        System.out.println(secondAgreement);
    }
}
