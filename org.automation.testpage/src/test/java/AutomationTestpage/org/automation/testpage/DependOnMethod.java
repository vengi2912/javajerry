package AutomationTestpage.org.automation.testpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DependOnMethod {
	WebDriver driver;
	@Test   
    public void executSessionOne(){
            //First session of WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
         driver.findElement(By.name("uid")).sendKeys("Driver 1");
         String d1= driver.findElement(By.name("uid")).getText();
         System.out.println(d1);
         
            
        }
        
    @Test  
        public void executeSessionTwo(){
            //Second session of WebDriver
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        String d2= driver.findElement(By.name("uid")).getText();
        System.out.println(d2);
        
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        String d3= driver.findElement(By.name("uid")).getText();
        System.out.println(d3);
        
        }        

}
