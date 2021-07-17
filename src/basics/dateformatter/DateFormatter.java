package basics.dateformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatter {

	public static void main(String[] args) throws ParseException {
		
		 
		    GregorianCalendar calendar= new GregorianCalendar();
		    String formatter="dd-MM-yyyy HH:mm:ss";
		    System.out.println(gregorianCalendarToSimpleDateConvertoer(calendar,formatter));
	
	}
	
	
	/**
	 * This method takes input GregorianCalendar date and return string as formatter
	 *
	 * @param date
	 *            input date
	 * @return the fdp format date
	 * @throws ParseException
	 *             the parse exception
	 */
	public static String gregorianCalendarToSimpleDateConvertoer(GregorianCalendar calendar, String formatter) throws ParseException{
		//GregorianCalendar calendar= new GregorianCalendar();
	    SimpleDateFormat fmt = new SimpleDateFormat(formatter);
	    fmt.setCalendar(calendar);
	    String dateFormatted = fmt.format(calendar.getTime());
	    
	    return dateFormatted;
		
	}

}
