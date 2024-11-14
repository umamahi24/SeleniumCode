package parallelScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
  @Test(groups = "featureOne")
  public void testOne() {
	  System.out.println("Test11 in Sample one");
  }
  
  @Test(groups = "featureTwo")
  public void testTwo() {
	  System.out.println("Test12 in Sample one");
  }
  @Test
  public void testThree() {
	  System.out.println("Test13 in Sample one");
  }
  @Test
  public void testFour() {
	  System.out.println("Test14 in Sample one");
  }
}
