package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingTest {
	@Test
	public void Testcase1() throws InterruptedException {
		//Open Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Navigate to URL
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		//driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
		//To get current URL
		String cUrl_=driver.getCurrentUrl();
		System.out.println("cUrl_:"+cUrl_);
		//Maximize Browser
     	driver.manage().window().maximize();
				
		//Refresh Webpage
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElementById("nav_motorcycle").click();
		Thread.sleep(3000);
		//navigate back one level
		driver.navigate().back();
		Thread.sleep(3000);
		//Do forward one level
		driver.navigate().forward();
		Thread.sleep(3000);
		//driver.navigate().hashCode();
	
		
		
		//Synchronization setting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Actualtitle = driver.getTitle();
		System.out.println("Actual title is:" +Actualtitle);

		//Verify if title is correct
		
		//Assertion in TestNG
		Assert.assertEquals(Actualtitle, "Tricentis Vehicle Insurance1","Tricentis is not matching for vehicle insurance data");
       


		//Click on Motorcycle link
		Thread.sleep(2000);
		driver.findElementById("nav_motorcycle").click();
		Thread.sleep(5000);

		driver.findElementById("cylindercapacity").sendKeys("100");
		Thread.sleep(2000);
		driver.close();







		//Enter Login credentials





	

