package jan_pac1;

import java.util.Scanner;

public class Lab3 {
	String firstname;
	String lastname;
	String gender;
	String phnumber;
	Lab3(String first,String last, String gen , String phno )
	{
		this.firstname=first;
		this.lastname=last;
		this.gender=gen;
		this.phnumber= phno;
	}
	public void Person()
	{
		String Persondetails;
	//	Persondetails=firstname + lastname + gender;
		//System.out.println("First Name is :"+Persondetails);
		System.out.println("First Name is :"+firstname);
		System.out.println("Last Name is:"+lastname);
		System.out.println("Gender is:"+gender);
		System.out.println("ph no  is:"+phnumber);
	}
}

	

