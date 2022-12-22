package org.selenium.day1;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import javax.swing.text.NumberFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableforloop {

	public static void main(String[] args) throws InterruptedException, ParseException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver newurl = new ChromeDriver();
		
		String max;
		
		double m =0, r=0;
		
		        newurl.get("http://demo.guru99.com/test/web-table-element.php");
		        
		      newurl.manage().window().maximize(); 
		      
		      
		      List<WebElement> col = newurl.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		      
		      System.out.println("no of column is:" + col.size());
		      
		      List<WebElement>  row = newurl.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		      
		      row.size();
		      
		      System.out.println("no of rows is:"+ row.size());
		      
		      for (int i = 1; i < row.size(); i++) {
		    	  
		    	  max = newurl.findElement(By.xpath("(//*[@id=\"leftcontainer\"]/table/tbody/tr)["+ (i)+"]/td[4]")).getText();
		    	  
		    	  NumberFormat f = NumberFormat.getInstance();
		    	  
		    	  Number num =f.parse(max);
		    	  
		    	  max = num.toString();
		    	  
		    	  m = Double.parseDouble(max);
		    	  
		    	  if (m>r) {
		    		  
					r=m;
				}
//		   	if (m<r) {
//		    		
//					r=m;
//				}  
		    	  
		    	  
		    	  
		    	  
				
			}
		      System.out.println("Maximum current price is : "+ r);
		      System.out.println("Minimum current price is : "+ r);
	
		
		
		      Thread.sleep(1000);
		      newurl.quit();
		
		
	}

}
