package AutomationTestpage22.autotestpage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testpagepractises {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		LoginPageTest page = new LoginPageTest(driver);
		
	
				
	page.pageurl("Step1: Verify page url", "https://practice.automationtesting.in/", "https://practice.automationtesting.in/");
	page.ShopMenuButton("stepDescripiton:ShopMenu", "ShopMenu Clikced and Opend");
	page.HomeButton("StepDes:HomeKey Button", "Homekey Button Cliked Sucessfully");
	page.alretkey("StepDesc:Alret window ", "alret window canceld sucessfully");
	page.Sliderspage("StepDes:Three Sliders Display", "Three Sliders in Display Window");
	
	}

		
		
	}

