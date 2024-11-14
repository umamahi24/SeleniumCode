package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validLoginTest {
	WebDriver driver;
	Properties prop;
	
	@BeforeTest
	public void readProperty() throws IOException {
		String path=System.getProperty("user.dir")+"//resources//configuration//config.properties";
		
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		
	}
	
	@BeforeMethod
	public void setup() {
		String browserConfig = prop.getProperty("browser");
		

		if(browserConfig.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		if(browserConfig.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}

		if(browserConfig.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test
	public void loginTest() {
	
	
		String url=prop.getProperty("url");
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
	    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	   driver.findElement(By.className("radius")).click();
	    driver.findElement(By.className("//button[@class='radius']//i")).click();

}
}
