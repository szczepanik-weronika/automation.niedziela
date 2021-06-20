package automation.steps;

import automation.BankAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BankAccountSteps { 
    private BankAccount bankAccount;
private boolean isWithdrawPossible;
    

    @Given("BankAccount has {int} PLN")
        public void bankAccountHasPLN(int amount) {
            bankAccount = new BankAccount(amount);

        }

    @When("User withdraw {int} PLN")
    public void userWithdrawPLN(int withdrawMoney) {
            isWithdrawPossible = bankAccount.withdraw(withdrawMoney);
        }

    @Then("Transaction should be possible")
    public void transactionShouldBePossible() {
        Assert.assertTrue(isWithdrawPossible);
    }

    @And("Account balance should be {int} PLN")
    public void accountBalanceShouldBePLN(int accountBalance ) {
        Assert.assertEquals(accountBalance, bankAccount.getAccountBalance());
    }

    @Then("Transaction should not be possible")
    public void transactionShouldNotBePossible() {
        Assert.assertFalse(isWithdrawPossible);
    }

    @And("User transfer {int} PLN")
    public void userTransferPLN(int transferAmount) {
        bankAccount.transfer(transferAmount);
    }
}

    