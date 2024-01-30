package pac2;

import java.util.Scanner;

public class TC007Wrapperclass {

	public static void main(String[] args) {
	String strvalue="1234";
	int c;
	c=100;
	System.out.println(strvalue+c);

	
	int d= Integer.parseInt(strvalue); //String value converted in int by using this methos
	System.out.print(d+c);
	
	Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			System.out.print("Integer vale :"+i);
	
	}

}
