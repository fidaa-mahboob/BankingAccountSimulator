package bankingapp;

public abstract class Account implements Rate {
    private String name;
    private String sSN;
    private double balance;
    private double rate;
    private String accNumber;
    public Account(String name, String sSN, double initDeposit) {
        System.out.println("Name: " + name);
        System.out.println("Account Name: ");
        this.name = name;
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
