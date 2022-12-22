package facebooklogin.org.facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTestPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		LoginPage page = new LoginPage(driver);
				
	page.pageurl("Step1: Verify page url", "Page url is verified", "https://www.facebook.com/");	
	page.pagetitle("Step1: Verify page Title", "Page title is verified", "Facebook – log in or sign up");

	page.mailidverify("step description for emailid", "the email id is verifed", "Email address or phone number");	
	page.passwordverify("stepdec password verify", "password is verified", "Password");
	page.forgetpass("step desc forgetpass ", "click pass verified");
	page.signInButton("stepdesc logbutton verify", "logbutton verifed ");
	
		// page.usernamemail("vengi29132@gmail.com");
		// page.password("29121993");
		// page.logbutton();
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
