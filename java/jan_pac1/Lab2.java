package jan_pac1;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");  
		int a= sc.nextInt();  
		
		if(a==0)
		{
			System.out.print("Even value printed");
		}
		else
		{
			System.out.print("odd value printed");
		}
	}

}
