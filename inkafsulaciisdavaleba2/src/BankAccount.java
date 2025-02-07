import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;
    private boolean accountLock;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        this.accountLock = false;
    }

    public void printTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }

        for (String transaction : transactionHistory) {
            if (transaction != null) {
                System.out.println(transaction);
            }
        }
    }

    public boolean transferMoney(BankAccount targetAccount, double amount) {
        if (this.accountLock) {
            System.out.println("Account is blocked. Cannot perform any transactions.");
            return false;
        }

        if (amount > 1000) {
            System.out.println("Cannot transfer more than 1000 dollars.");
            return false;
        }

        if (this.balance >= amount) {
            this.balance -= amount;
            targetAccount.balance += amount;
            String transaction = "Transferred " + amount + " to " + targetAccount.accountHolder;
            this.transactionHistory.add(transaction);
            targetAccount.transactionHistory.add("Received " + amount + " from " + this.accountHolder);
            System.out.println("Transfer successful.");
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }


    public void blockAccount() {
        this.accountLock = true;
        System.out.println("Account is now blocked.");
    }


    public void unblockAccount() {
        this.accountLock = false;
        System.out.println("Account is now unblocked.");
    }


    public double depositCalculator(double amount, int months) {
        if (this.accountLock) {
            System.out.println("Account is blocked. Cannot perform any transactions.");
            return 0;
        }

        double finalAmount = amount;
        for (int i = 0; i < months; i++) {
            finalAmount += finalAmount * 0.01;
        }
        System.out.println("Amount after " + months + " months: " + finalAmount);
        return finalAmount;
    }


    public double getBalance() {
        return balance;
    }

    public boolean isAccountLock() {
        return accountLock;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

}
