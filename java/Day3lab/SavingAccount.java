/*package Day3lab;
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

*/