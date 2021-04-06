package TrainingTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class NavigatetoNextPage {
	@Test
	
	public void navigatePages() throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/table-sort-search-demo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		Thread.sleep(1000);
		
		//WebElement ele_naviagte = driver.findElement(By.xpath("//*[@id='example_next']"));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",ele_naviagte);
		driver.get(driver.getCurrentUrl());
		
		String empName = "G. Winters";
		
		WebElement nextButton = null;
		//using for loop, it tries for 3 times.
		//If the element is located for the first time then it breaks from the for loop and come out of the loop
		for(int i =0; i<=2; i++) {
			try {
				nextButton = driver.findElement(By.id("example_next"));
				break;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			  if(i==2) {
				  throw new Exception("Ele not located by trying three times");
				  
			  }
			
			
			}
		}
		
		while(nextButton.isEnabled()) {
			nextButton.click();
			//to verify if emp exist
			empFind(empName);
		}	
	}

	    //table[@id='example']/tbody/tr/td[text()='G. Winters']/following-sibling::td[1]--->Designation
	    //table[@id='example']/tbody/tr/td[text()='G. Winters']/following-sibling::td[5]--->Salar
	
	
	private void empFind(String empName) {
		
		
	
			try {
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/table-sort-search-demo.html");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
			
				//String empName = "G. Winters";
				
				WebElement empElement = driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[text()='"+empName+"']/following-sibling::td[1]"));
				
			
		//verify employee designation
		String e_desg = driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[text()='"+empName+"']/following-sibling::td[1]")).getText();
		System.out.println("e_desg:"+e_desg);
		
		//verify employee salary
		String e_salary= driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[text()='"+empName+"']/following-sibling::td[5]")).getText();
	    
		System.out.println("e_salary:"+e_salary);
		
			}catch (Exception e) {
				System.out.println("file not found");
			}
		
		//User does not exist
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Alex");
	
		
		//total row count
		
		//List<WebElement> row_WebEle_list=driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		
		//int rowCount=row_WebEle_list.size();
		//System.out.println("rowCount: "+rowCount);
		
		//total col count
		
	   // List<WebElement>col_WebEle_list=driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));
		
		//int colCount=col_WebEle_list.size();
		
		//System.out.println("colCount: "+colCount);
		//js.executeScript("document.value='Sailaja'");
		
	
		//driver.navigate().forward();
	
			}
	
}
