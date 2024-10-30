package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GooglePageTest {

	WebDriver driver;

	@Test
	public void searchJavaTest() {

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//options.setBrowserVersion("121");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("testing");
		searchBox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@jsname='UWckNb']")).click();
		
		System.out.println(driver.getTitle()+ driver.getCurrentUrl());
		//searchBox.clear();
		//searchBox.sendKeys("java");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
	}
}
