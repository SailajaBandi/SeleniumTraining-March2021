package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselectDD {

	
	@Test
	
	public void multi_dd() {
		System.out.println("Testing MultiSelectDropDown list");
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
		
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
	     
				WebElement multiselectdd = driver.findElement(By.id("selenium_suite"));
				Select multi_dd = new Select(multiselectdd);
				
				//by using selectByVisibleText method
				    //multi_dd.selectByVisibleText("Selenium Grid");
				    //multi_dd.selectByVisibleText("Limitations");	
				
				//by using selectByVAlue method
				   //multi_dd.selectByValue("IDE");
				   //multi_dd.selectByValue("RC"); 
				   //multi_dd.selectByValue("Adv");
				
				//by using SelectByIndex method
				    multi_dd.selectByIndex(0);
				    multi_dd.selectByIndex(3);
				    multi_dd.selectByIndex(5);
}
}
