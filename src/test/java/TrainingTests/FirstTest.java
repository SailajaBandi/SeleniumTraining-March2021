package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {

		//Open Browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Navigate to URL
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		//Maximize Browser
		driver.manage().window().maximize();
		//Synchronization setting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get the title
		String Actualtitle = driver.getTitle();
		System.out.println("Actual title is:" +Actualtitle);
	
		//Verify


		//Click on Motorcycle link
		Thread.sleep(2000);
driver.findElementById("nav_motorcycle").click();
  Thread.sleep(5000);

driver.findElementById("cylindercapacity").sendKeys("100");
Thread.sleep(2000);
driver.close();







		//Enter Login credentials

	}

}
