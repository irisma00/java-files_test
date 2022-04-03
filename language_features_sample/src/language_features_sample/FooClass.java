package language_features_sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FooClass<T> {
	public static void main(String[] args) {
		Date d = new Date(1022968390000L);
		Date a = new Date(1311120000000L);
		System.out.println(d);
		
		String string_date = "15-September-2020";

		SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
		f.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
		    d = f.parse(string_date);
		    long milliseconds = d.getTime();
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		System.out.println(d.getTime());
		System.out.println(d);
	}
}
