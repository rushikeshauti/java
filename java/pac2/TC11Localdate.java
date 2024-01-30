package pac2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TC11Localdate {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

Scanner sc=new Scanner(System.in);
System.out.println("Enter your birth date dd/mm/yyyy");

String dateofbirth= sc.nextLine();
System.out.println("You Entered :"+dateofbirth);

LocalDate d1=LocalDate.parse(dateofbirth, formatter);
System.out.println(d1);

Period p1=date1.until(d1);



	}

}
