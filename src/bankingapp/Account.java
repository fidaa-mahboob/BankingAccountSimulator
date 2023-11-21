package bankingapp;

public abstract class Account implements Rate {
    String name;
    String sSN;
    double balance;
    double rate;
    String accNumber;
    static int index = 10000;
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        ++index;
        this.accNumber = setAccountNumber();
    }

    private String setAccountNumber() {
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        return sSN.substring(sSN.length() - 2) + uniqueID + randomNumber;
    }

    public void Deposit(){

    }

    public void Withdraw(){

    }

    public void Transfer(){

    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name
                + "\nBALANCE: £" + balance
                + "\nACCOUNT NUMBER: " + accNumber
        );
    }
}
