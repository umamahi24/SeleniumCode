package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public  class RemoteWebDriverTest {
	
	WebDriver driver;
	
	@Test
	public void test() throws MalformedURLException{
		//ChromeOptions options=new ChromeOptions();
		EdgeOptions options=new EdgeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		String strHub="http://10.0.12.25:4444";
		driver = new RemoteWebDriver(new URL(strHub),options);
		driver.get("https://www.google.com");
		//ctrl space to get annotations
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("appium");
		searchBox.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("appium - Google Search", title);
		driver.close();;
	}
	

}
