package TrainingTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling {
	
	
	//TableHnadlingDemo
		@Test
		
		
		public void TableHandlingDemo() {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/table-sort-search-demo.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.navigate().forward();
		
		String empName = "C. Kelly";
		 ////table[@id='example']/tbody/tr/td[text()='C. Kelly']/following-sibling::td[1]--->Designation
	    ////table[@id='example']/tbody/tr/td[text()='C. Kelly']/following-sibling::td[5]--->Salary

		//verify employee designation
		String e_desg = driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[text()='"+empName+"']/following-sibling::td[1]")).getText();
		Assert.assertEquals(e_desg, "Senior Javascript Developer");

		
		//verify employee salary
		String e_salary= driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[text()='"+empName+"']/following-sibling::td[5]")).getText();
		Assert.assertEquals(e_salary, "$433,060/y");
		//total row count
		
		List<WebElement> row_WebEle_list=driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		
		int rowCount=row_WebEle_list.size();
		System.out.println("rowCount: "+rowCount);
	
		//total col count
		
	    List<WebElement>col_WebEle_list=driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));
		
		int colCount=col_WebEle_list.size();
		
		System.out.println("colCount: "+colCount);
		}
		
		
		}

