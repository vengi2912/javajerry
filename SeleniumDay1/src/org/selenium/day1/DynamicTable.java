package org.selenium.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver newurl = new ChromeDriver();
		
		// newrul.get("http://demo.guru99.com/test/web-table-element.php");
			
		newurl.get("http://demo.guru99.com/test/web-table-element.php");

		
		newurl.findElement(By.xpath("(//table/tbody)[2]"));
		
		//no of coloumns 
		
		List<WebElement> col = newurl.findElements(By.xpath("//table/thead/tr/th"));
		
		System.out.println("no of col size is " + col.size());
		
		// no of rows 
		
		List<WebElement> rows = newurl.findElements(By.xpath("//*[@class='dataTable']/tbody/tr"));
		
		System.out.println("no of row size is " + rows.size());
		
		for (int i = 1; i < col.size(); i++) {
			WebElement rowprint = newurl.findElement(By.xpath("//table/thead/tr/th"));
			//System.out.println(rowprint.getText());
			
		}for (int i = 1; i < rows.size(); i++) {
			
			    WebElement print = newurl.findElement(By.xpath("(//*[@class='dataTable']/tbody/tr )[" + (i) +"]"));
			
			    System.out.println(print.getText());			
			// //*[@id="leftcontainer"]/table/tbody/tr/td[1]
			    
//			    WebElement company = newurl.findElement(By.xpath("(//*[@class='dataTable']/tbody/tr)["+ (i) + "]/td[3]"));
//			    
//			    System.out.println(company.getText());
		}
		
		
		newurl.close();
		
				
				
				
				
	}

}
