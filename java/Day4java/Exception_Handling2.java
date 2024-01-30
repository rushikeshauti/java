package Day4java;

public class Exception_Handling2 {

	public static void main(String[] args) {
	
		int d=5,a;
		try {
			a=42/d;
			System.out.println("This will not be printed");
		}catch (ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.println("This will get printed");
		

	}

}
