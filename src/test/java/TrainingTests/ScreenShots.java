package TrainingTests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {
		@Test
				public void screenShots() throws IOException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/frames/index.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Selenium");
		//Take Screenshot by using TypeCasting
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File newObject = new File("/Users/sailaja/Selenium/Scrshot.png");
			FileUtils.copyFile(f1, newObject);

		}
}