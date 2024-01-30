package Day3java;

public class lab5main {
		public static void main(String[] args) {
	
			lab5_savingAccount sav1 = new lab5_savingAccount("rohini", 3000);
			lab5_currentaccount cur1 = new lab5_currentaccount("jadhav", 2000);
			
			sav1.display();
			cur1.display();
			
			sav1.withdraw(2000);
			cur1.withdraw(1000);
		}

	}



