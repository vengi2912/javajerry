import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;  
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;   
 import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.testBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import 

public class CucumberTest  {
	
By username = By.xpath("//input[@type='text']");
	
	By password =By.xpath("//input[@type='password']");
	
	By loginbutton = By.xpath("//button[@name='login']");
	
	By forgetpass = By.xpath("//a[text()='Forgotten password?']");
	
	By createnewacc = By.xpath("//a[contains(text(),'Create New Account')]");

	
	
	
    	
    
	
	@Given("I am on facebook loginpage")
	public static void i_am_on_facebook_loginpage() {	
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";			
        driver.get(baseUrl);					
		
		
		WebDriver driver = new ChromeDriver();
	    
		
  		driver.navigate().to("https://www.facebook.com/");		
	}

	@When("I click on loginbutton using username and passoword")
	public void i_click_on_loginbutton_using_username_and_passoword() {
		
		driver.findElement(username).sendKeys("vengi93@yahoo.com");
		driver.findElement(password).sendKeys("Ramyasri@2912");
		driver.findElement(loginbutton).click();
	}

	@Then("navigate to userhomepage")
	public void navigate_to_userhomepage() {
		driver.findElement(By.xpath("//a[@aria-label='Home']"));
		System.out.println("loginsucessfully");
		
	    
	}

}
