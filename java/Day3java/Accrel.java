package Day3java;
public class Accrel {
		   public static void main(String[] args) {
		    	Account1 smith = new Account1("Smith", 2000);
		    	Account1 kathy = new Account1("Kathy", 3000);
		        smith.deposit(2000);
		        kathy.withdraw(2000);
		        smith.getbalance();
		        kathy.getbalance();
		        System.out.println("Smith's Account Balance: INR " + smith.getbalance());
		        System.out.println("Kathy's Account Balance: INR " + kathy.getbalance());
		        System.out.println("Smith's Account Information :" + smith.toString());
		        System.out.println("Kathy's Account Information :" + kathy.toString());
		    }
	}


