package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {
	
	@Test
	
	public void testRadioButton_simpleway() {
		System.out.println("Testing Radio Button Test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/basic-radiobutton-demo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//select radio button
		String radiobuttontobeselected="Female";
		
		if(radiobuttontobeselected.equalsIgnoreCase("Male")) {
          driver.findElement(By.xpath("//*[@name='optradio'and @value ='Male']")).click();
		}else if(radiobuttontobeselected.equalsIgnoreCase("Female")) {
          driver.findElement(By.xpath("//*[@id='buttoncheck']")).click();
		}
		
		WebElement buttoncheck = driver.findElement(By.id("buttoncheck"));
		buttoncheck.click();
		WebElement selectedbutton = driver.findElement(By.xpath("//button[@id='buttoncheck']/parent::/p/following-sibling"));
		String str = selectedbutton.getText();
		//Radio button Female is checked
		String expectedString = "Radio button'"+radiobuttontobeselected+"'is checked";
		Assert.assertEquals(str, expectedString);
		}
		
		
	
	}






