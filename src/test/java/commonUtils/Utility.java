package commonUtils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {


	public static String getScreenshotPath(WebDriver diver)
	
	{
		TakesScreenshot screen=(TakesScreenshot)diver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		
		return null;
		
	}
}
