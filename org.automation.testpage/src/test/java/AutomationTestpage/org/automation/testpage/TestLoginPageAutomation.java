package AutomationTestpage.org.automation.testpage;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;





public class TestLoginPageAutomation {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeMethod (alwaysRun = true)
	public void chromebrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe" );
	}
	@Test
	public void urlpage() {
		LoginPage page = new LoginPage(driver);
		List<String> Description=new ArrayList<String>();
		Description.add("Product Description");
		Description.add("The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver. It contains hundreds of solutions to real-world problems, with clear explanations and ready-to-run test scripts you can use in your own projects.");
		List<String> ReviewDescription =new ArrayList<String>();
		ReviewDescription.add("Reviews");
		ReviewDescription.add("There are no reviews yet.");
		page.pageurl("Step1: Verify page url", "https://practice.automationtesting.in/", "https://practice.automationtesting.in/");
		page.ReviewTag("StepDesc:Reviewtitle and review verification", "reviewed sucessfully", ReviewDescription);
		page.MenuItemPriceProductDetails("stepSec:Menu Item Detials", "No of Books No of Quantity and Price feteched sucessfully");
		Assert.assertTrue(true);
		
	}	
	@Test
	public void Test2 () {
		List<String> Description=new ArrayList<String>();
		Description.add("Product Description");
		Description.add("The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver. It contains hundreds of solutions to real-world problems, with clear explanations and ready-to-run test scripts you can use in your own projects.");
		
		LoginPage page = new LoginPage(driver);
		page.pageurl("Step1: Verify page url", "https://practice.automationtesting.in/", "https://practice.automationtesting.in/");
		Assert.assertEquals(page.pageurl("Step1: Verify page url", "https://practice.automationtesting.in/", "https://practice.automationtesting.in/"), "https://practice.automationtesting.in/");
		page.ShopMenuButton("stepDescripiton:ShopMenu", "ShopMenu Clikced and Opend");
		Assert.assertTrue(true, "shopmenu clickedsuccessfully");
		page.HomeButton("StepDes:HomeKey Button", "Homekey Button Cliked Sucessfully");
		Assert.assertTrue(true);
		page.Sliderspage("StepDes:Three Sliders Display", "Three Sliders in Display Window");
		Assert.assertTrue(true, "three sliders on homemenun button");
		page.arivelspage("step Desc: three arives on page", "The Home page has Three Arrivals only");
		Assert.assertTrue(true);
		page.imagenavigate("Step Desc:image clickable and navigate to next page", "image clicked and next page appears");
		Assert.assertTrue(true);
		page.addtobascket("stepdesc:addtobascket cart", "add to bascket cart sucessfully");
		Assert.assertTrue(true);
		page.productdescription("stepdesc:image descrriptionverify", "expected and actual verified sucessfully ", Description);
		Assert.assertTrue(true);
		
	}
	
}
