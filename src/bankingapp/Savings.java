package bankingapp;

public class Savings extends Account {

    int savingsAccID;
    int  savingsAccKey;
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "1" + accNumber;
    }

    private void setUpSavingsAccount(){
        savingsAccID = (int) (Math.random() * Math.pow(10, 3));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }
}
