package org.selenium.day1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver mouse = new ChromeDriver();
		
		mouse.get("https://www.browserstack.com/guide/action-class-in-selenium");
		
		mouse.manage().window().maximize();
		
		WebElement homelink = mouse.findElement(By.xpath("//*[@id=\"product-menu-toggle\"]"));
		
		Actions builder =  new Actions(mouse);
		
		org.openqa.selenium.interactions.Action mouseoverhome = (org.openqa.selenium.interactions.Action) builder.moveToElement(homelink).build();
		
		mouseoverhome.perform();
		
		
		

	}

}
