package TrainingTests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNGDemo1 {
	
	@BeforeClass
	
	public void beforeClassSetup() {
		//create test data file object
		System.out.println("Before class method");
		
	}
	
	@BeforeMethod
	
	public void testSetup() {
		//Launching browser and login
		//Opening File
		//db connection
		System.out.println("Test setup method---before method");
	}
	@Test(priority = 1)
	
	public void test1() {
		System.out.println("Test Case 1");
	   
	}
	 
	
	@Test(priority = 2, timeOut = 5)//(enabled = false)
	
	public void test2() {
		 System.out.println("Test Case 2");
		 
	} 
    @Test(priority = -1)
	
	public void zoo() throws Throwable {
    	Thread.sleep(1);
		System.out.println("zoo Test");
    }
    
    @Test(//(dependsOnMethods = ("testMethod3"),"testMethod2"))
    public void testMethod4() {
    	System.out.println("Test Method 4");
    }
    @Test(testName=)
    public void testMethod() {
    	//assertTrue(false);
    	System.out.println("Test Method ");
    }
    @Test
    public void testMethod3() {
    	//assertTrue(false);
    	System.out.println("Test Method 3");
    }
    @Test
    private void  testMethod5() {
    assertTrue(false); 
		// TODO Auto-generated method stub
		
	}


	@Test
    public void testMethod2() {
    	System.out.println("Test Method 2");
    }
    @AfterMethod
		
		 public void tearDown() {
			 //close browser
			 //report update
			 //db connection close
			 System.out.println("Closing connections---after method");
		 }
		 @AfterClass
		 
		public void afterClassSetup() {
			//close test data file object
			System.out.println("After class method");
			
		}	
}
	

