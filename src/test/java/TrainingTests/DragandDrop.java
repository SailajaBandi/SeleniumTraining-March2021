package TrainingTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	
		@Test
		public void testActions() throws Throwable {
			//http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/frames/index.html
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/drag-and-drop-demo.html");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

			Actions act = new Actions(driver);
			
		
		WebElement srcele = driver.findElement(By.xpath("//*[@id='todrag']/span[contains(text(),'Draggable 1')]"));
		 //act.contextClick(srcele).build().perform();
		WebElement destele = driver.findElement(By.xpath("//*[@id='mydropzone' and @dropzone='move']"));
		//act.contextClick(destele).build().perform();
		//Thread.sleep(5000);
		act.clickAndHold(destele).build().perform();
		Thread.sleep(5000);
		act.moveToElement(destele).build().perform();
		Thread.sleep(5000);
		act.dragAndDrop(srcele, destele).build().perform();
		Thread.sleep(5000);
		driver.close();
	
		
		}				
}
