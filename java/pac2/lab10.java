package pac2;

import java.util.Scanner;

public class lab10 {
	  	public boolean checkString()
	  	{
	  			System.out.println("Enter the Word : ");
	  			Scanner sc = new Scanner(System.in);
	  			String message = sc.nextLine();
	  			for(int i = 0 ;i < message.length()- 1;i++)
	  			{
	  				int a = (int)message.charAt(i);
	  				int b = (int)message.charAt(i + 1);
	  				if(a > b)
	  				{
	  					System.out.println("Word is negative");
	  					return false;
	  				}	
	  			}
	  	return true;
	  	}
	  	public static void main(String[] args) {
	  		lab10 obj= new lab10();
	  	   boolean bo = obj.checkString();
	  		if(bo == true)
	  		{
	  			System.out.println("Word is positive");
	  		}
	}
}
