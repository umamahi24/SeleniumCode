package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SampleTwoTest {
	WebDriver driver;
  @Test
  public void testOne() {
	  driver=new ChromeDriver();
	  long id=Thread.currentThread().getId();
	  System.out.println("Test21 in Sample one"+id);
  }
  
 @Test(groups = "featureOne")
  public void testTwo() {
	 driver=new ChromeDriver();
	 long id=Thread.currentThread().getId();
	  System.out.println("Test22 in Sample one"+id);
  }
  @Test
  public void testThree() {
	  driver=new EdgeDriver();
	  long id=Thread.currentThread().getId();
	  System.out.println("Test23 in Sample one"+id);
  }
  @Test(invocationCount = 4,threadPoolSize = 2,timeOut = 10000 )
  public void testFour() {
	  driver=new EdgeDriver();
	 
	  long id=Thread.currentThread().getId();
	  System.out.println("Test24 in Sample one"+id);
  }
  
  //@AfterTest
  public void tearDown() {
	  driver.close();
  }
}
