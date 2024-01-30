package Day3lab;
public class Main12 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("John", 5000, 1000);
        CurrentAccount currentAccount = new CurrentAccount("Alice", 3000, 2000);
        System.out.println("Savings Account Balance before withdrawal: INR " + savingsAccount.getBalance());
        savingsAccount.withdraw(2000);
        System.out.println("Savings Account Balance after withdrawal: INR " + savingsAccount.getBalance());
        System.out.println("\nCurrent Account Balance before withdrawal: INR " + currentAccount.getBalance());
        currentAccount.withdraw(5000);
        System.out.println("Current Account Balance after withdrawal: INR " + currentAccount.getBalance());
    }
}
