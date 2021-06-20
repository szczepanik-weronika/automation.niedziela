package automation;

public class BankAccount {
    public int accountBalance;
    public BankAccount() {
        accountBalance = 0;
    }
    public BankAccount(int accountBalance){
        this.accountBalance = accountBalance;
    }
    public boolean withdraw (int amount) {
        if (amount > accountBalance) {
            return false;
        }
        else {
            accountBalance -= amount;
            return true;
        }
    }
    public void transfer(int amount) {
        accountBalance += amount;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
}