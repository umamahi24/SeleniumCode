package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GooglePageTest {

	WebDriver driver;

	//@BeforeMethod
	@BeforeTest
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	//@Test
	public void searchJavaTest() {

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//options.setBrowserVersion("121");
		//driver = new ChromeDriver(options);
		

		driver.get("https://www.google.com");
		
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("testing");
		searchBox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@jsname='UWckNb']")).click();
		
		System.out.println(driver.getTitle()+ driver.getCurrentUrl());
		//searchBox.clear();
		//searchBox.sendKeys("java");
		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//	
	}
	
	@Test(enabled=true,priority = 0)// to ignore test
	
	public void seleniumSearchtest() throws InterruptedException {

		driver.get("https://www.google.com");
		//ctrl space to get annotations
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Selenium");
		searchBox.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("Selenium - Google Search", title);
	
		
	}
	
	@Test(priority = -1)
	public void cucumberSearchtest()  {

		driver.get("https://www.google.com");
		//ctrl space to get annotations
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Cucumber");
		searchBox.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("Cucumber1 - Google Search", title);
	
		
	}
	
	@Test(dependsOnMethods ="cucumberSearchtest",alwaysRun = true )//alwaysrun will run test even if depends on method fail also
	public void appiumSearchtest()  {

		driver.get("https://www.google.com");
		//ctrl space to get annotations
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("appium");
		searchBox.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("appium - Google Search", title);
	
		
	}
	
	//@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
	
	
}
