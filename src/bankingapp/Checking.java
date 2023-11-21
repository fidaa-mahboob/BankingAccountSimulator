package bankingapp;

public class Checking extends Account {

    private int debitCardNumber;
    private int debitCardPin;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "2" + accNumber;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking");
    }
}
