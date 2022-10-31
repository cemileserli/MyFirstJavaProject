package thisExamples;

public class BankTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Jason");
        CreditCart cc1 = new CreditCart(1, 1000);
        c1.setCc(cc1);
        cc1.setOwner(c1);

        Customer c2 = new Customer(2, "Scott");
        CreditCart cc2 = new CreditCart(2, 500, c2);
    }
}
