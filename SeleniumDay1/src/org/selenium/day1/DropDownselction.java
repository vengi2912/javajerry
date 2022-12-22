package org.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownselction {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver newurl = new ChromeDriver();
		
		
//		newurl.get("http://demo.guru99.com/test/newtours/register.php");
//		
//		
//		
//		Select  dropdowncheck = new Select(newurl.findElement(By.xpath("//select[@name='country']")));
//		
//		dropdowncheck.selectByVisibleText("INDIA");
//		
		newurl.get("http://jsbin.com/osebed/2");
		
		newurl.findElement(By.xpath("//select[@id='fruits']"));
		
		Select drop = new Select(newurl.findElement(By.xpath("//select[@id='fruits']")));
		
		drop.selectByValue("banana");
		drop.selectByVisibleText("apple");
		drop.selectByIndex(3);
		
		
		
	//	Thread.sleep(10000);
		
		//newurl.quit();
		
	}

}
