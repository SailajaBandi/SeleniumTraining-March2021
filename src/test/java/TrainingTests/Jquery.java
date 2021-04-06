package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery {
	
	
	//Jquery Dropdown
	@Test
	
	public void JqueryDemo() {
		System.out.println("Testing JQueryDropDown list");
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
		
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
	
			//click on dropdown so that popup is visible
				driver.findElement(By.id("salutation-button")).click();
				
				//get all webelements from popmenu and store them in a list
				String valuetobeselected = "Other";
				WebElement dd_ele_toBeSelected = driver.findElement(By.xpath("//ul[@id='salutation-menu']//li/div[text()='"+valuetobeselected+"']"));
				dd_ele_toBeSelected.click();
						
}
}


