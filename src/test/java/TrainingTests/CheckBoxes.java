package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public void multi_dd() {
		System.out.println("Testing Checkboxes");
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
		
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
	     //single check box click
				driver.findElement(By.id(("isAgeSelected")).
				
	}
}
