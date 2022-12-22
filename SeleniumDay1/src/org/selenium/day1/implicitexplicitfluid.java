package org.selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.WaitStrategy;

public class implicitexplicitfluid {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver newwindows = new ChromeDriver();
		
		 Timeouts implicitlyWait = newwindows.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		String etitle= "Demo venkat Guru99 Page";
		
		String atitle= "";
		
		newwindows.get("http://demo.guru99.com/test/guru99home/");
		
		atitle=  newwindows.getTitle();
		  
		
		
		if(atitle.equals(etitle)) {
			System.out.println(atitle + "is same");
		}else {
			System.out.println(atitle + "is not same");
		}
		
		WebElement gugu99;
		
		
		
		
		
		newwindows.close();
	}

}
