package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorTest {
	WebDriver driver;
	@Test
	public void loginTest() {
		//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
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
	    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	   driver.findElement(By.className("radius")).click();
	    //driver.findElement(By.className("//button[@class='radius']//i")).click();
	    

	
		driver.close();
		
		
		
		
	}

}
