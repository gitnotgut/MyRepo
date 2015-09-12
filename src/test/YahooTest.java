package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {
  
	  @BeforeSuite
	  public void initializeSelenium(){
		  //initialize selenium object - webdriver
		  
		  System.out.println("In the very beginning - initialize selenium");
		  
	  }
	  
	  @AfterSuite
	  public void shutDownSelenium(){
		  
		  //Destroyed
		  
		  System.out.println("In the very ending - destroy selenium");
	  }
	
	
	
	  @Test
	  public void testReceiveMail() {
		  
		  //selenium code
	  System.out.println("Testing Receiving Mail");
		  
	  }
	  @Test
	  public void testSendMail() {
		  
		  //selenium code
	  System.out.println("Testing Sending Mail");
		  
	  }
	  
	    
	  @BeforeMethod
	  public void openBrowser() {
		  
		  System.out.println("Opening Browser");
	  }
	  
	  @AfterMethod
	  public void closeBrowser(){
		  
		  System.out.println("Closing Browser");
	  }
	
	  @BeforeTest
	  public void openConn() {
		  
		  System.out.println("Connecting to DB");
	  }
	  
	  @AfterTest
	  public void closeConn(){
		  
		  System.out.println("Closing Connection");
	  }

}
