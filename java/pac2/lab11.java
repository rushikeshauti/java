package pac2;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class lab11 {
		public static void main(String[] args) { 
	  	LocalDate date1=LocalDate.now();
				Scanner sc= new Scanner(System.in);
			    System.out.println("Enter your date in yyyy-MM-dd");
			    String date=sc.nextLine();
	        sc.close();
			     System.out.println("Current date: "+ date1); 
				LocalDate d1=  LocalDate.parse(date);
				Period p1= date1.until(d1);
					System.out.println(p1);//   
					System.out.println("Days: "+p1.get(ChronoUnit.DAYS));   
					System.out.println("Months: "+p1.get(ChronoUnit.MONTHS));
					System.out.println("Years: "+p1.get(ChronoUnit.YEARS));	
	}
}
