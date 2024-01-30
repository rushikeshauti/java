package pac2;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
public class lab14timezone {
	private static final Instant ZoneDateTime = null;
	public static void main(String[] args) {
		Instant currenttime=Instant.now();
		System.out.print("current date and time :"+currenttime);
		LocalDate date1 = LocalDate.now();
		LocalDate ind=LocalDate.of(1947,Month.AUGUST,15 );
		System.out.print("current date  :"+date1);
		System.out.print("current date  :"+ind);
		System.out.print("Tomorrow  :"+date1.plusDays(1));
		System.out.print("Last Month :"+date1.minusMonths(1));
		ZonedDateTime ct=ZonedDateTime.now();
		ZonedDateTime ctparis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Indian Time:"+ct);
		System.out.println("Paris current Time:"+ctparis);
		Period p1=date1.until(ind);
		System.out.println("Period :"+p1);
		System.out.println("Days :"+p1.get(ChronoUnit.DAYS));
		System.out.println("Months :"+p1.get(ChronoUnit.MONTHS));
		System.out.println("Years :"+p1.get(ChronoUnit.YEARS));
	}

}
