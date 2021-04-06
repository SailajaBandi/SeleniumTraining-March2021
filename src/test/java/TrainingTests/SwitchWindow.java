package TrainingTests;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow {
	@Test
	
	public void switchWindow() throws Throwable {
		
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/automation-practice-switch-windows/index.html");
			
			driver.findElement(By.xpath("//*[@onclick='newBrwTab()']")).click();
			
			//find window id ==> find for both, main window and child window
			 String parentwindow = driver.getWindowHandle();
			 System.out.println("parentWindow: "+parentwindow);
			 
			 Set<String> windowSet = driver.getWindowHandles();
			 System.out.println("windowSet: "+windowSet);
			 
			String childwindow = "";
			for(String window : windowSet) {//for-each loop where windowSet is the iterable item and window is the variable which stores the value of the windowSet
				System.out.println("window: "+window);
				if(window != parentwindow) {
					//then this is your child window 
					childwindow = window;
					//driver.close(); //at this point, it will close only child window
				}
			}
			
			//switch to new window
			driver.switchTo().window(childwindow);
			driver.findElement(By.name("q")).sendKeys("Demo Search");
			driver.findElement(By.name("btnK")).click();
			
			System.out.println("#### "+ parentwindow.isEmpty());
			
			//switch to parent window
			driver.switchTo().window(parentwindow);
			assertEquals(driver.findElement(By.xpath("//h1")).getText(),"Automation Practice Switch Windows");
			
			//driver.close(); //will close current window where driver is focused, that is, parent window
			//Thread.sleep(3000);
			driver.quit(); // will close all windows launched by current driver instance
			
	}

}
