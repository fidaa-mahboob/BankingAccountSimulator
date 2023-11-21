package bankingapp;

public class Checking extends Account {

    int debitCardNumber;
    int debitCardPin;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "2" + accNumber;
        setDebitCard();
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Checking Account Info "
          + "\n Debit Card Number: " + debitCardNumber +
           "\n Debit Card PIN " + debitCardPin);
    }
}
