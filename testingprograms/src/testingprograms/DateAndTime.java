package testingprograms;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateAndTime {

	public static void main(String[] args) {
		
		LocalDate mydate =  LocalDate.now();
		System.out.println(mydate);
		
		LocalTime mytime = LocalTime.now();
		System.out.println(mytime);
		
		LocalDateTime mydatetime = LocalDateTime.now();
		System.out.println("before Formating");
		System.out.println(mydatetime);
		
		
		DateTimeFormatter myformet = DateTimeFormatter.ofPattern("DD-MM-YYYY HH:MM:SS");
		
		String DateandTime = mydatetime.format(myformet);
		
		System.out.println("before Formating");
		
		System.out.println(DateandTime);
		

	}

}
