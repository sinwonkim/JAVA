package DateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		Date date = new Date();
		String d = date.toString();
		
		SimpleDateFormat simpleDate =new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(simpleDate.format(date));
	}

}
