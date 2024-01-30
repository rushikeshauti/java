package Day3java;

public class labBA {

	public static void main(String[] args) {

		A smith=new  A("Smith",2000);
		A Kaithy=new  A("Kaithy",3000);
		
	smith.deposite(2000);
	Kaithy.withdraw(1000);
		
		smith.displaybalance();
		Kaithy.displaybalance();
		
	}

}
