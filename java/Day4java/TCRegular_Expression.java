package Day4java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TCRegular_Expression {

	
	public static void main(String[] args) {
		
	String str1="Welcome";
	String pattern="Welcome";
		
	boolean patternmatch=Pattern.matches(str1,pattern);
	
	System.out.println("Matching :"+pattern);
	
	String input="Shop,Mop,Hopping,Chopping";
	Pattern p1=Pattern.compile("hop");
	Matcher m1=p1.matcher(input);
	System.out.println(m1.matches());
	while(m1.find()) {
		System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
	}
	
	
	String n1="0987654321";
	String s1="Welcome to Amazon 123";
	String email="abc12@email.com";
	Pattern p2=Pattern.compile("^[A-Z].*[0-9]$");  //.*= in between anything it will accept
	Pattern emailpattern=Pattern.compile("^(.+)@(\\S+)$"); 
//	Pattern p3=Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
	Pattern p3=Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
	//^[A-Z]= It will take captial Alphabate 
	//[0-9]$= It will take digit
	
	Matcher email1=emailpattern.matcher(email);
	
	Matcher m2=p2.matcher(s1);
	
	Matcher m3=p3.matcher(n1);
	
	if(email1.find())
	{
		System.out.println(" Email  Pattern matched");
	}
	else
	{
		System.out.println(" Email Pattern not  matched");
	}
	
	
	
	
	
	
	
	
	
	if(m3.find())
	{
		System.out.println(" Ph number Pattern matched");
	}
	else
	{
		System.out.println(" Ph no Pattern not  matched");
	}
	
	if(m2.find())
	{
		System.out.println("Pattern matched");
	}
	else
	{
		System.out.println("Pattern not  matched");
	}
	}
}
