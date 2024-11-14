package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsSampleTest {
	
  WebDriver driver;
  ExtentReports extentReports;
  ExtentSparkReporter spark;
  ExtentTest extentTest;
  
  @BeforeTest()
  public void setupExtent() {
	  extentReports= new ExtentReports();
	  spark=new ExtentSparkReporter("test-output/SparkReport.html");
	  extentReports.attachReporter(spark);
  }
  @BeforeMethod
  public void setUp() {
	  driver =new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  
	@Test(enabled=true,priority = 0)// to ignore test
	
	public void seleniumSearchtest() throws InterruptedException {
		extentTest=extentReports.createTest("Selenium test");

		driver.get("https://www.google.com");
		//ctrl space to get annotations
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Selenium");
		searchBox.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("Selenium - Google Search", title);
	
		
	}
	
	
	@Test(priority = -1,retryAnalyzer = RetryAnalyzerImpl.class)
	public void cucumberSearchtest()  {
		extentTest=extentReports.createTest("cucumbet test");

		driver.get("https://www.google.com");
		//ctrl space to get annotations
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Cucumber");
		searchBox.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("Cucumber1 - Google Search", title);

}
	
	@AfterTest
	public void finishExtent()
	{
		extentReports.flush();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus())
		{
			extentTest.log(Status.FAIL, result.getThrowable().getMessage());
		}
		driver.close();
	}
}
