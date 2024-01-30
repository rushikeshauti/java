package Day3java;

import java.util.UUID;

public class A {

	private String accnum;
	private double balance;
	private String person;
	
	public A(String accholdername, double initbal) {
		this.accnum=UUID.randomUUID().toString();
		this.person=accholdername;
		this.setBalance(initbal);
		
	}
	public void deposite(double amount) {
	setBalance(getBalance() + amount);
	System.out.print(amount+"deposited to your accountnumber"+accnum);
	}

	public void withdraw(double amount) {
		if(getBalance()>=amount)
		{
			setBalance(getBalance() + amount);
		System.out.print(amount+"witdrawn to your accountnumber"+accnum);
		}
		else
		{
			System.out.print("insufficient balance");
		}
	}
	public void displaybalance() {
		System.out.println("Accountholder : "+accnum);
		System.out.println("Accountholdername : "+person);
		System.out.println(" balance : "+getBalance());
}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}