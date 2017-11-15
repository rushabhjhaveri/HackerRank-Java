import java.util.*;
import java.text.DateFormatSymbols;
import java.time.*;
public class date_and_time {
	

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		System.out.println(getDay(day, month, year));
	}

	private static String getDay(String day, String month, String year) {
		// TODO Auto-generated method stub
		//Calender cal = Calender.getInstance();
		String res = "";
		DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
		String weekdays[] = dfs.getWeekdays();
		        
		Calendar cal = new GregorianCalendar(Locale.US);
		cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));

		res = weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();
		return res;
	}
	

}
