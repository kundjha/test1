package Practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date mydate=new Date();
		Calendar cal=new GregorianCalendar();
		cal.setTime(mydate);
		String Today=mydate.toString();
		//String TodayDay=Today.substring(0,3);
		String TodayMonth=Today.substring(4,7).toUpperCase();
		String TodayDate=Today.substring(8,10);
		String TodayYear=Today.substring(24,28);
		//System.out.println(TodayDay);
		System.out.println(TodayMonth);
		System.out.println(TodayDate);
		System.out.println(TodayYear);
		//System.out.println(Today);
		/*cal.add(Calendar.DAY_OF_MONTH,90);
		//System.out.println(mydate);
		Date booking=cal.getTime();*/
	    Date booking=DateMethod.bookingdate(90);
	    String bookingtime=booking.toString();
	    List<String> BookingMDY=DateMethod.Monthdayyear(bookingtime);
	    //System.out.println(BookingMDY);
	    //System.out.println(BookingMDY.get(0));
	    //System.out.println(BookingMDY.get(1));
	    //System.out.println(BookingMDY.get(2));
	    String Month=(BookingMDY.get(0)).toUpperCase() ;
	    String Date=BookingMDY.get(1);
	    String Year=BookingMDY.get(2);
	    System.out.println(Month);
	    System.out.println(Date);
	    System.out.println(Year);
	    //System.out.println(bookingtime.substring(0,3));
		//System.out.println(bookingtime.substring(4,7));
		//System.out.println(bookingtime.substring(8,10));
		//System.out.println(bookingtime.substring(24,28));
	    //System.out.println(after90);
		//System.out.println(today90);
		//int dayofmonth=cal.DAY_OF_MONTH;
		//int dayofweek=cal.DAY_OF_WEEK;
	     //int year=cal.YEAR;
	     //System.out.println(dayofmonth);
	     //System.out.println(dayofweek);
	     //System.out.println(year);
	    String s="February 2020";
	    s=s.toUpperCase();
		System.out.println(s.substring(0,3));

	}

	public static Date bookingdate(int duration){
		
		//Date mydate=new Date();
		Calendar cal=new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH,duration);
		Date booking=cal.getTime();
		return booking;
		
	}
	public static List<String> Monthdayyear(String bookingtime)
	{
		String Month;
		String Date ;
		String Year;
		ArrayList<String> MDY=new ArrayList<String>();
		Month=bookingtime.substring(4,7);
		Date=bookingtime.substring(8,10);
		Year=bookingtime.substring(24,28);
		//System.out.println(bookingtime.substring(4,7));
		//System.out.println(bookingtime.substring(8,10));
		//System.out.println();
		MDY.add(Month);
		MDY.add(Date);
		MDY.add(Year);
				//bookingtime.substring(8,10),bookingtime.substring(24,28);
		//Date=bookingtime.substring(8,10);
		//Year=bookingtime.substring(24,28);
		return MDY;
	}
	

}

