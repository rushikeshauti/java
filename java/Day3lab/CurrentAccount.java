/*package Day3lab;
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
*/