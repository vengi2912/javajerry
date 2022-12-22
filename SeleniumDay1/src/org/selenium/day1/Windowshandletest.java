package org.selenium.day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandletest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver newwindows = new ChromeDriver();
		
		newwindows.get("http://demo.guru99.com/popup.php");
		
		newwindows.manage().window().maximize();
		
		newwindows.findElement(By.id("//*[contains(@href, 'popup.php')]")).click();
		
		String mainwindow = newwindows.getWindowHandle();
		
		Set<String> s1 = newwindows.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!mainwindow.equalsIgnoreCase(ChildWindow))			
            {    		
                
                    
        }		
      }
	}
	
}
	


