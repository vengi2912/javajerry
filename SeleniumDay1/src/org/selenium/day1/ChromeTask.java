package org.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.buffer.ByteBufHolder;

public class ChromeTask {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		
		
		username.sendKeys("vengi93@yahoo.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Muthukamatchi#2912");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.submit();
		
		
		
		
		
		
		
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(100);
		driver.close();

	}

}
