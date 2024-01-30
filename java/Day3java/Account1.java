package Day3java;
import java.util.UUID;
public class Account1 {
	    private String accNum;
	    private String accHolder;
	    private double balance;
	    public Account1(String accHolder, double initialBalance) {
	        this.accNum = UUID.randomUUID().toString();
	        this.accHolder = accHolder;
	        this.balance = initialBalance;
	    }
	    public void deposit(double amount) {
	        balance += amount;
	       System.out.println(amount+"Is deposited to your account number."+accNum);
	    }
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	          System.out.println(amount+"Is withdraw from your account number."+accNum);
	        } else {
	            System.out.println("Insufficient funds for withdrawal.");
	        }
	    }
	   public double getbalance() {
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
	        return "Account Number: " + accNum + " Account Holder: " + accHolder + " Balance: INR " + balance;
	    }
	}
	

	