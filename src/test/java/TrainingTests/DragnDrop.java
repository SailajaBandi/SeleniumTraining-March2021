package TrainingTests;

import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class DragnDrop {
			
			@Test
			
				public void testDrag() throws Throwable {
				
					WebDriverManager.chromedriver().setup();
					WebDriver driver=new ChromeDriver();
					//Url for Drag and drop
					driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/droppable/index.html");
					
					//Url for Drag and drop by
					//driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/draggable/index.html");
					
					//url for ToolTip
					//driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/tooltip/index.html");
					//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					//driver.manage().window().maximize();

					Actions act = new Actions(driver);
					Thread.sleep(2000);
					
				//For drag and drop
					
				WebElement srcele = driver.findElement(By.xpath("//*[@id='draggable']"));
			WebElement destele = driver.findElement(By.xpath("//*[@id='droppable']"));
				act.dragAndDrop(srcele, destele).build().perform();
				
				//For drag and drop by
					
				//WebElement dragger = driver.findElement(By.xpath("//*[@id='draggable']"));
				//act.dragAndDropBy(dragger, 50, 30).build().perform();
			
				//For Tool Tip
//					WebElement eletool_tip = driver.findElement(By.xpath("//*[@title='We ask for your age only for statistical purposes.']"));
//					act.moveToElement(eletool_tip).click().sendKeys("**Years").build().perform();
//					System.out.println("Tool Tip is working fine on mouseover action");
//				
			}		
							
		}
		

	


