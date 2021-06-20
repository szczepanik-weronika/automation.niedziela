import automation.BankAccount;

public class main {
    public static void main(String[] args) {
        BankAccount Super = new BankAccount();
        Super.transfer(1000);
        Super.withdraw(700);
        Super.getAccountBalance();
        Super.withdraw(3000);
    }
}