public class BankAccount {

    protected double balance;
    public BankAccount(double balanceIn){
        this.balance = balanceIn;
    }

    public void printBalance(){
        System.out.println("Your account balance is $" + balance);
    }

}


class checkingAccount extends BankAccount{
    public checkingAccount(double balanceIn) {
        super(balanceIn);
    }

    @Override
    public void printBalance(){
        System.out.println("Your checking account balance is $" + balance);
    }

    public static void main(String[] args) {
        BankAccount myCheckings = new BankAccount(5000);
        myCheckings.printBalance();
        int[] addedBalances = new int[1];
        /* Null Pointer issue with addeddBalances array assingment
        myCheckings.addedBalances[0] = (int) myCheckings.balance;
        System.out.println(myCheckings.addedBalances);
        */
        addedBalances[0] = (int) myCheckings.balance;
        for (int num: addedBalances) {
            System.out.println(num);
        }

    }

}