package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {

	@BeforeTest
	  public void xyz() {
		  System.out.println("Before Executing Yahoo news test");
		  //throw new SkipException("Skipping");
	  }
	
	@Test
	  public void testSendMail() {
		  System.out.println("Executing Yahoo news test");
		  Assert.assertEquals("Good", "Good//");
		  //Assert.assertTrue(6<1, "Fail");
	  }

}
