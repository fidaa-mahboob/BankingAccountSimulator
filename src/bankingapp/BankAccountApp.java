package bankingapp;

public class BankAccountApp {
    public static void main(String[] args) {
        Checking checking = new Checking("Tom Smith", "123456789", 1500);
        checking.showInfo();
        checking.withdraw(500);
        checking.compound();
        System.out.println("\n");
        Savings savings = new Savings("Johnny Depp", "125374567", 2500);
        savings.showInfo();
        savings.deposit(4500);
        savings.transfer("Tom Jones", 1575);
        savings.compound();
    }
}
