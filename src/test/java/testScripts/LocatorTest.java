package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class LocatorTest {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browserConfig) {
		if(browserConfig.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		if(browserConfig.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}

		if(browserConfig.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
	}
	@Test
	public void loginTest() {
	
		//driver=new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
//		//driver.findElement(By.id("username")).sendKeys("tomsmith");
//	    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//	   driver.findElement(By.className("radius")).click();
	    //driver.findElement(By.className("//button[@class='radius']//i")).click();
	    

	
	   driver.get("http://uitestingplayground.com/ajax");
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(17));
	   driver.findElement(By.id("ajaxButton")).click();
	   wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("div#content")), "Data loaded with AJAX get request."));
		
	   String text=driver.findElement(By.cssSelector("div#content")).getText();
	   driver.close();
	   System.out.print(text);
		
		
		
		
	}

}
