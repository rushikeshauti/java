package Day3java;

	public class lab5_savingAccount extends lab5_Account{
		final double minbalance;
			public lab5_savingAccount (String accholder, double initialval) {
				super(accholder, initialval);
				this.minbalance = 2000;
			}
			@Override
			public void withdraw(double withdraw) {
				if(balance>=minbalance) {
					balance-=withdraw;
					System.out.println("Your balance is : "+ balance);
				}else
					System.out.println("Minimum Balance insufficient");
			}
		}

