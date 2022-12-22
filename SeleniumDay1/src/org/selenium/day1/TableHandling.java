package org.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver newwindows = new ChromeDriver();
		
		
   String baseurl = "http://demo.guru99.com/test/newtours/";
//	 
    newwindows.get(baseurl);	
//	 
//	 newwindows.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
//	 
//	 System.out.println(baseurl);
//	 
//	 newwindows.close();
//		
		
		String innerText = newwindows.findElement(By.xpath("//table[@width='100%']")).getText(); 		
		System.out.println(innerText); 
		newwindows.quit();
		
	}

}
