package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHandling {

	
	@Test

	public void AlertDemo() throws InterruptedException {
		System.out.println("Handling Alerts");

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/AlertMessage/index.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Generate Alerts for Demo purpose
	
		//Generate Confirm Box
		
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(3000);
		
		//handle alert
		Alert al = driver.switchTo().alert();

		//get text from alert
		System.out.println("The alert text is:" +al.getText());

		//accept alert
		//al.accept();
		
		//dismiss alert
		al.dismiss();
	//System.out.println("****(");
	
	 //Prompt Box
	
	//driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	
	
	
		//enter text to alerts
        //al.sendKeys("Ex:Selenium");
        
        
	}

}
