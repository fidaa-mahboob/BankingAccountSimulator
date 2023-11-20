package bankingapp;

public abstract class Account implements Rate {
    String name;
    String sSN;
    double balance;
    double rate;
    private String accNumber;
    public Account(String name, String sSN, double initDeposit) {
        System.out.println("Name: " + name + " SSN: " + sSN + " BALANCE: $" + initDeposit);
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
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
