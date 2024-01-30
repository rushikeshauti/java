package junitDay5;

import org.junit.Test;

public class TC001_j {

	@Test
	public void test1() {
Person p=new Person("aniket" , "jadhav");
System.out.println(p.getFirstName());
		
System.out.println(p.getLastName());		

System.out.println(p.FullName());
	}	
	
}
