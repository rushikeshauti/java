package Day5java;
import org.junit.Test;

import junitDay5.Person;
public class TC001junit1 {
		@Test
		public void test1() {
	Person p=new Person("pasha" , "gawade");
	System.out.println(p.getFirstName());
			
	System.out.println(p.getLastName());		

	System.out.println(p.FullName());
		}	
		
	}


