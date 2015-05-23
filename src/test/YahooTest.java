package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	
  @BeforeSuite // this is executed before executing tests in all java files
  public void initializeSelenium() {
	  System.out.println("initialize Selenium");
  }
  
  @AfterSuite // this is executed before executing tests in all java files
  public void shutdownSelenium() {
	  System.out.println("shutdown Selenium");
  }
  
  @Test
  public void testReceiveMail() {
	  System.out.println("Testing Receiving mail");
  }
  
  @Test
  public void testSendMail() {
	  System.out.println("Testing sending mail");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in before method");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("in before method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("in before test");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("in before test");
  }

}
//@BeforeTest @BeforeMethod @Test