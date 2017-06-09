

public class SavingsAccount extends BankAccount {


double miniumBalance;


public void withdraw(double amount) {
        double balance = getBalance();
        if (balance - amount > miniumBalance) {
                if (amount <= balance  && amount > 0) {
                        setBalance(balance - amount);
                }
        }

}







}
