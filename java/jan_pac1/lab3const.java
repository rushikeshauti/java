package jan_pac1;

import java.util.Scanner;

public class lab3const {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter Ph number : ");  
	String phno= sc.next(); 
		
		
		Lab3 obj=new Lab3("ketan","Auti","M",phno);
	
		obj.Person();
	
	}

}
