import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class DateFormatting {
	public static void main(String args[]){
		//Older version
		Date d =new Date();
		System.out.println(d);
		DateFormat dt = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dt.format(d));
		DateFormat german= DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN);
		System.out.println(german.format(d));
		SimpleDateFormat s= new SimpleDateFormat("ss");
		System.out.println(s.format(d));
		
		//Java 8
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd-MM-yyyyy");
		String Date1=ld.format(pattern);
		
		DateTimeFormatter french = DateTimeFormatter.ofPattern("d MMMM yy", Locale.FRENCH);
		String frenchDate = ld.format(french);
		System.out.println(frenchDate);
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		DateTimeFormatter n=DateTimeFormatter.ofPattern("hh.mm.ss");
		String nn=lt.format(n);
		System.out.println(nn);
		
	}

}
