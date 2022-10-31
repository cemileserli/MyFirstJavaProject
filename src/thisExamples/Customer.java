package thisExamples;

public class Customer {
    int id;
    String name;

    CreditCart cc;

    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }


    public Customer(int id, String name, CreditCart cc){
        this.id = id;
        this.name = name;
        this.cc = cc;
        cc.setOwner(this);
    }
    public void setCc(CreditCart cc){
        this.cc = cc;
    }

}
