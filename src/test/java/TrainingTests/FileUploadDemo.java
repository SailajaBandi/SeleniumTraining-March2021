package TrainingTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {
	
	@Test
	public void fileUpload() throws Throwable
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//button type = file
		        //driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/keyboard-events/index.html");
		        //WebElement browseButton = driver.findElement(By.id("browseFile"));
		        //browseButton.sendKeys("/Users/sailaja/Downloads/Girl.jpg");
	  
		//button type ! = file
				driver.get("http://demo.automationtalks.com/");
				driver.findElement(By.id("nextenterinsurantdata")).click();
				
		//Put path of image on clipboard-->to do ctrl-v
				String filePath = "/Users/sailaja/Downloads/Girl.jpg";
				StringSelection str = new StringSelection(filePath);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
				
				//click on open button
				driver.findElement(By.id("open")).click();
				
				Thread.sleep(4000);
		
		//robot class
				Robot rb = new Robot();
		// Press Control V		
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				Thread.sleep(2000);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);
				
	   //hit enter button
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
