package bankingapp;

public class Savings extends Account {

    int savingsAccID;
    int  savingsAccKey;
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "1" + accNumber;
        setUpSavingsAccount();
    }

    private void setUpSavingsAccount(){
        savingsAccID = (int) (Math.random() * Math.pow(10, 3));
        savingsAccKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
        System.out.println(
                "Your Savings Account Info"
                        + "\n SAVING ACC ID: " + savingsAccID
                        + "\n SAVING ACC KEY: " + savingsAccKey
        );
    }
}
