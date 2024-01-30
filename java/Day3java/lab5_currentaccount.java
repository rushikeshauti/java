package Day3java;

	public class lab5_currentaccount extends lab5_Account{

		final double limit;
		public lab5_currentaccount(String accholder, double initialval) {
			super(accholder, initialval);
			this.limit=1000;
		}
		@Override
		public void withdraw(double amt ) {
			if(limit<amt) {
				balance-=amt;
				System.out.println("Amount withdraw now your balance is: "+balance);
			}
			else
				System.out.println("You exceed the limit");
		}
	}
