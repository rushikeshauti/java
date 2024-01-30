package Day3java;
	class swapmachine{
		void readcard(){
			System.out.println("ok swapmachine");
		}
	}
	class chipcardmachine extends swapmachine {
		
	void readcard() {	
		System.out.println("ok chipmachinee");
	}
	}	
	public class overrinding {
	public static void main(String[] args) {
		
		swapmachine normal = new swapmachine();
		normal.readcard();  // reading normal swapcard
		chipcardmachine chip = new chipcardmachine();
		chip.readcard();    // reading chip card
	}
}
