import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalc {
 public static void main(String[] args) throws ParseException {
	 LocalDate l = LocalDate.of(1998, 1, 19); //specify year, month, date directly
	  LocalDate now = LocalDate.now(); //gets localDate
	  Period diff = Period.between(l, now); //difference between the dates is calculated
	  System.out.println(diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days ");
  /*Scanner in=new Scanner(System.in);
  String s="";
  System.out.println("Enter dob in dd-mm-yyyy format:");
  s=in.next();
  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
  Date d = sdf.parse(s);
  Calendar c = Calendar.getInstance();
  c.setTime(d);
  int year = c.get(Calendar.YEAR);
  int month = c.get(Calendar.MONTH) + 1;
  int date = c.get(Calendar.DATE);
  System.out.println(sdf.parse(s));
  LocalDate l1 = LocalDate.of(year, month, date);
  LocalDate now1 = LocalDate.now();
  Period diff1 = Period.between(l1, now1);
  System.out.println("Age:" + diff1.getYears()+" years "+ diff1.getMonths()+
		  " months "+ diff1.getDays()+" days ");*/
 }
} 