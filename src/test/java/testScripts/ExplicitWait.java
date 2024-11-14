package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	WebDriver driver;
	@Test
	public void loginTest() {
	
		driver=new ChromeDriver();

	
	   driver.get("http://uitestingplayground.com/ajax");
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(17));
	   driver.findElement(By.id("ajaxButton")).click();
	   wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("div#content")), "Data loaded with AJAX get request."));
	   String text=driver.findElement(By.cssSelector("div#content")).getText();
	  // driver.close();
	   System.out.print(text);
		
	   driver.get("http://uitestingplayground.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Load Delay")).click();
		driver.findElement(By.cssSelector("btn btn-primary")).click();
		}

}
