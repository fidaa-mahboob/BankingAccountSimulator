package bankingapp;

public class Savings extends Account {

    private int savingsAccID;
    private int  savingsAccKey;
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
    }
}
