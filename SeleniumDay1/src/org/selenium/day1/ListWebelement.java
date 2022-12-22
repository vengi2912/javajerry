package org.selenium.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebelement {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver newwindows = new ChromeDriver();
		
		newwindows.get("http://demo.guru99.com/test/ajax.html");
		
		List<WebElement> elements = newwindows.findElements(By.name("name"));
		
		System.out.println("Number of elements:" +elements.size());
		
		for (int i = 0; i <elements.size(); i++) {
			System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
			//System.out.println("Radio button  text:" + );
			
		}

	}

}
