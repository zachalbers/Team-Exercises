

public class SavingsAccount extends BankAccount {


double miniumBalance = 50;




public void withdraw(double amount) {
        double balance = getBalance();
        if (balance - amount > miniumBalance) {
                if (amount <= balance  && amount > 0) {
                        setBalance(balance - amount);
                }
        }

}



}
