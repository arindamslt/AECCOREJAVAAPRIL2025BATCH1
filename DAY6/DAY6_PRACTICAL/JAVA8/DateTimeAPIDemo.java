package JAVA8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimeAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate ld=LocalDate.now();
System.out.println(ld);
LocalDateTime ldt=LocalDateTime.now();
System.out.println(ldt);
int day=ldt.getDayOfMonth();
int month=ldt.getMonthValue();
int year=ldt.getYear();
int hh=ldt.getHour();
int minutes=ldt.getMinute();
int sec=ldt.getSecond();
System.out.println(day+"/"+month+"/"+year+" "+hh+":"+minutes+":"+sec);
LocalDate dt=LocalDate.of(2002,12,15);
System.out.println(dt);
LocalDate dob=LocalDate.of(1987,02,15);
LocalDate  currdt=LocalDate.now();
Period p=Period.between(dob, currdt);
int dd=p.getDays();
int mm=p.getMonths();
int yr=p.getYears();
System.out.println("AGE IS:"+"YEAR:"+yr+" "+"MONTH:"+mm+"+DAYS:"+dd);
	}

}
