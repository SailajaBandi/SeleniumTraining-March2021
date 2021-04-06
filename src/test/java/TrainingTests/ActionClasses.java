package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ActionClasses {

	@Test
	public void testActions() throws Throwable {
		//http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/frames/index.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/frames/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement ele_Keyboardevents=driver.findElement(By.linkText("Keyboard Events"));

		Actions act = new Actions(driver);
		Thread.sleep(2000);
		//act.contextClick(ele_Keyboardevents).build().perform();//For Right click

		act.click(ele_Keyboardevents).build().perform();
	}
}
//act.contextClick(ele_HTMLcontactform).build().perform();
//act.doubleClick(ele_HTMLcontactform).build().perform();
//act.clickAndHold(ele_HTMLcontactform).build().perform();
//act.dragAndDrop(ele_HTMLcontactform).build().perform();
//act.clickAndHold(ele_HTMLcontactform).build().perform();
//act.moveToElement(ele_HTMLcontactform).click().build().perform();