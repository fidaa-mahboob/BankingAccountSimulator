package bankingapp;

public abstract class Account implements Rate {
    private String name;
    private String sSN;
    private double balance;
    protected double rate;
    protected String accNumber;
    static int index = 10000;
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        ++index;
        this.accNumber = setAccountNumber();
        setRate();
    }

    private String setAccountNumber() {
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        return sSN.substring(sSN.length() - 2) + uniqueID + randomNumber;
    }

    public abstract void setRate();

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance += accruedInterest;
        System.out.printf("Compound Interest: £%.2f %n", accruedInterest);
        showBalance();
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: £" + amount);
        showBalance();
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawn: £" + amount);
        showBalance();
    }

    public void transfer(String recipient, double amount){
        if (!recipient.isEmpty()){
            balance -= amount;
            System.out.println("Transfer £" + amount + " to " + recipient + " successful");
            showBalance();
        } else {
            System.out.println("Add the recipient to complete transfer.");
        }
    }

    public void showBalance(){
        System.out.println("Current Balance: £" + balance);
    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name
                + "\nBALANCE: £" + balance
                + "\nACCOUNT NUMBER: " + accNumber
                + "\nRATE: " + rate + "%"
        );
    }
}
