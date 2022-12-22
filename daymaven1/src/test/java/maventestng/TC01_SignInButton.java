package maventestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_SignInButton {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// Creating object of HomePage
		HomePage homePage= new HomePage(driver);

		// Click on Sign in button
		homePage.clickOnSignInButton();

		// Creating an object of LoginPage
		LoginPage loginPage= new LoginPage(driver);

		// Sign in
		loginPage.signIn("Amod", "Password");

		//Quit browser
		driver.quit();

	}

}
