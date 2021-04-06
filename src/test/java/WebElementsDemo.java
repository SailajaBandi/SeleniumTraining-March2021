
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsDemo {

		//1st Test case
		@Test
		public void testRadioButton() {
			System.out.println("Testing radio button test");
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/basic-radiobutton-demo.html");
	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

	// select radio button(1st method)

	 String radioButtonToBeSelected="Male";
	 if(radioButtonToBeSelected.equalsIgnoreCase("Male"))
	 {

	 driver.findElement(By.xpath("//input[@name='optradio' and
	 @value='Male']")).click();
	 }

	 else if(radioButtonToBeSelected.equalsIgnoreCase("Female")) {

	 driver.findElement(By.xpath("//input[@name='optradio' and
	 @value='Female']")).click();

	// }

	//		
	//		//Select Radio Button(2nd method)
	//	
	//		List<WebElement> webList = driver.findElements(By.xpath("//input[@name='optradio']/parent::label"));
	//		
	//		String selRatdiobtn="";
	//		
	//		for(WebElement we : webList) {
	//			selRatdiobtn = we.getText();
	//			if(selRatdiobtn.equalsIgnoreCase("Female")){
	//			    we.click();
	//			}
	//		}
	//		WebElement buttonCheck = driver.findElement(By.id("buttoncheck"));
	//		buttonCheck.click();
	//		//button[@id='buttoncheck']/parent::/p/following-sibling
	//		WebElement selectedButton = driver.findElement(By.xpath("//button[@id='buttoncheck']"));
	//		//*[@id="easycont"]/div/div[2]/div[1]/div[2]/p[3]
	//		WebElement actualText = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]"));
	//		
	//		//String selectedRadioString = selectedButton.getText();
	//				
	//				//Radio button 'Female' is checked
	//		String actText = actualText.getText();
	//		
	//		String expectedString = "Radio button '"+selRatdiobtn +"' is checked";
	//		System.out.println(">>>>>>" + actText +" >>>>> "+expectedString);
	//			
	//		Assert.assertEquals(actText, expectedString);
	//	}
	//		

	// Check if "Get Checked Value" button is present or not

	//	//	@Test//Test case 3
	//		public void checkIfPresent() {
	//			System.out.println("Testing radio button test");
	//
	//			WebDriverManager.chromedriver().setup();
	//			WebDriver driver=new ChromeDriver();
	//			driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/basic-radiobutton-demo.html");
	//
	//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//			driver.manage().window().maximize();
	//   //webelement for "Get Checked Value" button
	//			WebElement button= driver.findElement(By.xpath("button[@id='buttonCheck']"));
	//			boolean isButtonPresent = button.isDisplayed();
	//			System.out.println("is Button Present:"+isButtonPresent);
	//		}

	//Checkboxes
	// Single checkbox click
	//	@Test
	//	private void checkSingleCheckBox() {
	//		System.out.println("Testing Checkboxes ");
	//
	//		WebDriverManager.chromedriver().setup();
	//		WebDriver driver=new ChromeDriver();
	//		driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/basic-checkbox-demo.html");
	//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//		driver.manage().window().maximize();
	//		
	//		
	//		//driver.findElement(By.id("isAgeSelected")).click();
	//		String checkboxToClick="option1;option2;option3";
	//		
	//		String[]checkboxToClick_arr= checkboxToClick.split(";");
	//		System.out.println("checkboxToClick:"+checkboxToClick);
	//		
	//		System.out.println("checkboxToClick_arr:"+checkboxToClick_arr);
	//		for(int i=0;i<checkboxToClick_arr.length;i++) {
	//			String tocheck=checkboxToClick_arr[i];
	//			
	//			List<WebElement> webelementChecklist = driver.findElements(By.xpath("//div[text()='MultipleCheckboxDemo]/following-sibling::div//label"));
	//			
	//		
	//			for(WebElement we : webelementChecklist) {
	//				String check = we.getText();
	//				if(check.equalsIgnoreCase("To Check Box To Click")){
	//						    we.click();
	//				}
	//			}
	//			
	//		}
	//		

	 checking dropdownDemo
	 Simple dropdown--Coded in Select tag
		@Test
	
		public void dropDownDemo() {
			System.out.println("Testing DropDown list");
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	
			//Simple dropdown--Coded in Select tag
		
			WebElement element_dd = driver.findElement(By.id("programming-languages"));
			Select sel=new Select(element_dd);
			//sel.selectByValue("PHP");
			//sel.selectByIndex(1);
			sel.selectByVisibleText("C#");
			System.out.println("The Selected element is:"+sel);

	//Multiselect dropdown list 
	//	@Test
	//	
	//	public void dropDownDemo() {
	//		
	//
	//		System.out.println("Testing multiDropDown list");
	//
	//		WebDriverManager.chromedriver().setup();
	//		WebDriver driver=new ChromeDriver();
	//		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
	//
	//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//		driver.manage().window().maximize();
	//
	//		WebElement Multieledd=driver.findElement(By.id("selenium_suite"));
	//		Select multi_dd = new Select(Multieledd);
	//		
	//		multi_dd.selectByVisibleText("Selenium Grid");
	//	
	//		multi_dd.selectByVisibleText("Selenium WebDriver");
	//	}
	//}

	////Multiselect dropdown list with split and iteration  using "SelectByVisibleText" method
		//@Test
	
//		public void dropDownDemo() {
//	
//			System.out.println("Testing multiDropDown list");
//	
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//			driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
//	
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
//	
//			WebElement Multieledd = driver.findElement(By.id("selenium_suite"));
//			Select multi_dd = new Select(Multieledd);
//		     //verify if dropdown is multiselect or not
//		System.out.println("Is multiselect dropdown?"+multi_dd.isMultiple());



//	
//			String MultiselectDD = "Selenium IDE;Selenium RC;Advantages";
//	
//			String[] Multiselect_arr = MultiselectDD.split(";");
//	
//			WebElement MultieleDD = driver.findElement(By.id("selenium_suite"));
//			
//			Select multidd = new Select(Multieledd);
//	
//			for (int i = 0; i < Multiselect_arr.length; i++) {
//				
//				multidd.selectByVisibleText(Multiselect_arr[i].toString());
//				System.out.println("The selected list of elements are:"+Multiselect_arr[i]);
//	
//			}
//	
//		}
	


	//	//Multiselect dropdown list with split and iteration using "SelectByValue" method
	//		@Test
	//
	//		public void dropDownDemo() {
	//
	//			System.out.println("Testing multiDropDown list");
	//
	//			WebDriverManager.chromedriver().setup();
	//			WebDriver driver = new ChromeDriver();
	//			driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
	//
	//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//			driver.manage().window().maximize();
	//
	//			WebElement Multieledd = driver.findElement(By.id("selenium_suite"));
	//			Select multi_dd = new Select(Multieledd);
	//		
	//
	//			String MultiselectDD = "IDE;RC;Limitations";
	//
	//			String[] Multiselect_arr = MultiselectDD.split(";");
	//
	//			WebElement MultieleDD = driver.findElement(By.id("selenium_suite"));
	//			
	//			Select multidd = new Select(Multieledd);
	//
	//			for (int i = 0; i < Multiselect_arr.length; i++) {
	//				
	//				multidd.selectByValue(Multiselect_arr[i].toString());
	//				System.out.println("The selected list of elements are:"+Multiselect_arr[i]);
	//
	//			}
	//
	//		}
	//	}

	//Multiselect dropdown list with split and iteration using "SelectByIndex" method
		//@Test
	
	//	public void dropDownDemo() {
	
	//		System.out.println("Testing multiDropDown list");
	
//	//		WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//			driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
//	
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
//	
//			WebElement Multieledd = driver.findElement(By.id("selenium_suite"));
//			Select multi_dd = new Select(Multieledd);
		
	
		//	String MultiselectDD = "1;3;5";
			

		//	String[] Multiselect_arr = MultiselectDD.split(";");
	
		//	WebElement MultieleDD = driver.findElement(By.id("selenium_suite"));
			
		//	Select multidd = new Select(Multieledd);
	
		//	for (int i = 0; i < Multiselect_arr.length; i++) {
				
		//		multidd.selectByIndex(Multiselect_arr[i].toString());
			//	System.out.println("The selected list of elements are:"+Multiselect_arr[i]);
	//
			//}
	
		//}
	//}
	

	
	
	

	
	
			//ScreenShots Demo
			 @Test
				
				public void testScreenShots() {
					System.out.println("Testing ScreenShots");
					
					WebDriverManager.chromedriver().setup();
					WebDriver driver=new ChromeDriver();
					driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/frames/index.html");
					//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Selenium");
					
			

