package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;
  @Test
  public void dragAndDrop() throws InterruptedException {
	  driver=new ChromeDriver();
//	  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//	  driver.manage().window().maximize();
//	  Actions action=new Actions(driver);
//	 Thread.sleep(2000);
//	  WebElement src=driver.findElement(By.xpath("//li[contains(@class,'ui-draggable')][1]"));
//	  WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
//	  
//	  action.dragAndDrop(src, target).build().perform();
//	  driver.close();
	  
	 driver.get("https://stqatools.com/demo/Windows.php");
	 String parentWindow=driver.getWindowHandle();
	 WebElement newTabBtn=driver.findElement(By.xpath("//button[contains(text(),'new Tab')]"));
	 newTabBtn.click();
	 
	 Set<String>  handles=driver.getWindowHandles();
	 
	 for(String handle:handles) {
		 if(!handle.equalsIgnoreCase(parentWindow)) {
			 driver.switchTo().window(handle);
			 System.out.println(driver.getTitle());
			 
		 }
	 }
	 driver.close();
	  
  }
}
