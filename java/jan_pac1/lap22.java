package jan_pac1;

import java.util.Scanner;

public class lap22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");  
		int a= sc.nextInt();  
		
		if(a>0)
		{
			System.out.print("Positive value printed");
		}
		else if(a<0)
		{
			System.out.print("Negative value printed");
		}
		else {
			System.out.print("It is Not Negative or positive");
		}
		

	}

}
