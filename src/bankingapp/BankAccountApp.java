package bankingapp;

public class BankAccountApp {
    public static void main(String[] args) {
        Checking checking = new Checking("Tom Smith", "123456789", 1500);
        checking.showInfo();

        Savings savings = new Savings("Johnny Depp", "125374567", 2500);
        savings.showInfo();
    }
}
