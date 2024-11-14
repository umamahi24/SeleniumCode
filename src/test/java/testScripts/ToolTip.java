package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip {
	WebDriver driver;

	@Test
	public void toolTip() {

		ChromeOptions options = new ChromeOptions();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.id("age")).sendKeys(Keys.ARROW_DOWN);
		Actions action1=new Actions(driver);
	}

}
