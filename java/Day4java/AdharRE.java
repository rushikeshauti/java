package Day4java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdharRE {

	public static void main(String[] args) {
		
	
		String Adhar="0987 6543 2156";
		
	//	Pattern Adharpattern =Pattern.compile("(\"[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]\");");
		Pattern Adharpattern =Pattern.compile("^\\\\d{4}\\\\s\\\\d{4}\\\\s\\\\d{4}$");
		Matcher Adharr=Adharpattern.matcher(Adhar);
	
		if(Adharr.find())
		{
			System.out.println(" Adhar  Pattern matched");
		}
		else
		{
			System.out.println(" Adhar Pattern not  matched");
		}
		
//		String Adhar="234567890987 ";
		//	Scanner scanner = new Scanner(System.in);
	   //     System.out.println("Enter Adhar ID: ");
	   //     Adhar.substring(scanner.nextInt());
	   //     scanner.nextLine(); 
	}

}
