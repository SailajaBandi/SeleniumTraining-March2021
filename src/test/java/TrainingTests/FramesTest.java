package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTest {
	
	//Test Frames
	@Test

			public void testFrames() {
	
		System.out.println("Test Frames");
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/frames/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Selenium");
		
		//click on check box
		//jump to frame
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
	
		
		//jump back to main frame
	driver.switchTo().parentFrame();
	
		//Verify title"))
		String heading = driver.findElement(By.xpath("/h1[@class='entry-title']")).getText();
			Assert.assertEquals(heading, "DemoHeading");
		
	}
		
		

}
