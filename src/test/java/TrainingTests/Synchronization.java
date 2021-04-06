package TrainingTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {
	@Test
	
	public void explicitwait() {
		WebDriverManager.chromedriver().setup();
		//generate alert
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtalks.com/WebDriverWait%20Demo/practice/wait.html");
		driver.findElement(By.id("alert")).click();
	
	//WebDriver wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		al.accept();
		
		//generate button after 10sec forcefully
		driver.findElement(By.id("display-other-button")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement button = driver.findElement(By.id("hidden"));
		
		wait1.until(ExpectedConditions.visibilityOf(button));
		button.click();
		
	}

}
