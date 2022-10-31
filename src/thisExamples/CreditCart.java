package thisExamples;

public class CreditCart {
    int no;
    double balance;

    Customer owner;

    public CreditCart(int no, double balance){
        this.no = no;
        this.balance = balance;

    }

    public CreditCart(int no, double balance, Customer cc) {
        this.no = no;
        this.balance = balance;
        this.owner = cc;
        owner.setCc(this);
    }

        public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
