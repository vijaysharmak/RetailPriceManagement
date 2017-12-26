package generic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import exceptions.TakeScreenshotException;

public class Screenshot {
	// This method is to generate the date-time stamp.
	public static String generateTimeStamp() {
		SimpleDateFormat sDate = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String dateTime = sDate.format(new Date());
		return dateTime;
	}
	
	// This method is to generate the image name for taking screenshots.
	// Image name will be generated using date-time stamp, file extension will be ".png".
	public static String generateImageName() {
		String imgName=generateImageName()+".png";
		return imgName;
	}
	
	// This method will take the screenshot and will save in a new file.
	public static void takeScreenshot(WebDriver driver, String destFile) {
		TakesScreenshot t = (TakesScreenshot)driver;
		File printScreen = t.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(printScreen, new File(destFile));
		}
		catch(Exception e) {
			throw new TakeScreenshotException("There has been an exception while taking a screenshot."); 
		}		
	}
	
}
