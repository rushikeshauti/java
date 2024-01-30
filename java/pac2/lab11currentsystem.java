package pac2;
import java.util.Date;
import java.util.Scanner;
import java.time.Month;
import java.time.LocalDate;
public class lab11currentsystem {
	    public static void
	    getDayMonthYear(String date)
	    {
	        LocalDate currentDate= LocalDate.parse(date);
	        int day = currentDate.getDayOfMonth();
	        Month month = currentDate.getMonth();
	        int year = currentDate.getYear();
	        System.out.println("Day: " + day);
	        System.out.println("Month: " + month);
	        System.out.println("Year: " + year);
	    }
	    public static void main(String args[])
	    {
	    	Scanner sc= new Scanner(System.in);
		    System.out.println("Enter your date in yyyy-MM-dd");
		    String date=sc.nextLine();
  			 getDayMonthYear(date);
	    //    String date = "2020-07-18";
	    //    getDayMonthYear(date);   
	}
}
