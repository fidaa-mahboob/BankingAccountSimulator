package bankingapp;

public abstract class Account implements Rate {
    String name;
    String sSN;
    double balance;
    double rate;
    private String accNumber;
    static int index = 10000;
    public Account(String name, String sSN, double initDeposit) {
        System.out.println("Name: " + name + " SSN: " + sSN + " BALANCE: $" + initDeposit);
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        this.accNumber = setAccountNumber();
        System.out.println("Account Number: " + this.accNumber);
    }

    private String setAccountNumber() {

        int uniqueID = index ;
        return sSN.substring(sSN.length() - 2, sSN.length()) + uniqueID;
    }

    public void Deposit(){

    }

    public void Withdraw(){

    }

    public void Transfer(){

    }

    public void showInfo(){
        System.out.println("null");
    }
}
