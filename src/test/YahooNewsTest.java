package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {
	
	@BeforeTest
	public void xyz(){
		
		System.out.println("Before executing - Yahoo News Test");
		//throw new SkipException("Skipping this due to some reason");
	}
	
	@Test
	public void testYahooNews(){
		
		System.out.println("Executing Yahoo News Test");
		Assert.assertEquals("Good", "Good");
		try{
		Assert.assertTrue(6>11, "Six is greater than One");
		}catch(Throwable t){
			
			System.out.println("assert true is failed");
		}
		Assert.assertFalse(1>9, "Print when true");
		
		System.out.println("in the yahoo news test");
	}

}
