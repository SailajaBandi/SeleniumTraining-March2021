package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class JavaScriptExecutorDemo {

	
	@Test

	public void windowSwitchTest() throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		//next enter insurance data
		WebElement button = driver.findElement(By.id("nextenterinsurantdata"));
         
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);
		Thread.sleep(2000);
		js.executeScript("document.getElementById('firstname').value='Sailaja'");
		
		

	}


}


