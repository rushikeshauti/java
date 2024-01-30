package Day4java;
import java.util.Scanner;
public class lab22trymain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		lab2try p1 = new lab2try();
		p1.setName("Rahul ");
		String n = p1.getName();
		 try {	 
			 p1.setAge(1);
			   p1.getempdetails();
		   }catch(AgeException e){ 
			System.out.println(n  + " Age is "+e);
			   
		   }
	}
}


