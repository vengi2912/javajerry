package org.selenium.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(10));

		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		
		driver.get("http://demo.guru99.com/test/guru99home/" );
		
		driver.manage().window().maximize() ;
		
		aTitle = driver.getTitle();
		
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
//		WebElement guru99seleniumlink;
//		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
//		guru99seleniumlink.click();
		
		WebElement gugu;
		gugu=waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		gugu.click();
	}

}
