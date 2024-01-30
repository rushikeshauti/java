package Day3lab;
import java.util.UUID;
class Account {
    protected String accNum;
    protected String accHolder;
    protected double balance;
    public Account(String accHolder, double initialBalance) {
        this.accNum = UUID.randomUUID().toString();
        this.accHolder = accHolder;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccNum() {
        return accNum;
    }
    public String getAccHolder() {
        return accHolder;
    }
    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }
    @Override
    public String toString() {
        return "Account Number: " + accNum + "\nAccount Holder: " + accHolder + "\nBalance: INR " + balance;
    }
    // Withdraw method to be overridden by subclasses
    public boolean withdraw(double amount) {
        return false;  // Default implementation, overridden in subclasses
    }
}
//savingaccount
class SavingsAccount extends Account {
    private final double minimumBalance;
    public SavingsAccount(String accHolder, double initialBalance, double minimumBalance) {
        super(accHolder, initialBalance);
        this.minimumBalance = minimumBalance;
    }
    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal failed. Minimum balance requirement not met.");
            return false;
        }
    }
}
//currentclass
class CurrentAccount extends Account {
    private double overdraftLimit;
    public CurrentAccount(String accHolder, double initialBalance, double overdraftLimit) {
        super(accHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal failed. Overdraft limit reached.");
            return false;
        }
    }
}






