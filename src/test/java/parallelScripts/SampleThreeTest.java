package parallelScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test(groups = "featureThree")
  public void testOne() {
	  System.out.println("Test31 in Sample one");
  }
  
  @Test(groups = "featureThree")
  public void testTwo() {
	  System.out.println("Test32 in Sample one");
  }
  @Test(groups = "featureOne")
  public void testThree() {
	  System.out.println("Test33 in Sample one");
  }
  @Test(groups = "featureThree")
  public void testFour() {
	  System.out.println("Test34 in Sample one");
  }
}
