package generic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utilities {
	// This method is to generate a random number.
	public static int generateRandomNum() {
		Random r = new Random();
		int randomVal = r.nextInt(100000000);
		return randomVal;
	}
		
	// This method is to generate the date-time stamp.
	public static String generateTimeStamp() {
		SimpleDateFormat sDate = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String dateTime = sDate.format(new Date());
		return dateTime;
	}
}
