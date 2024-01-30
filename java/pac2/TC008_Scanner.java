package pac2;

import java.util.Scanner;

public class TC008_Scanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner("1 2 3 4 5 6 7 8 9");
		
while(sc.hasNextInt())
{
	int num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println("Even no is "+num);
	}
	else 
		System.out.println("This is odd no"+num);
		
	
}
	}

}
