package org.facebooklogin.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	
	public Loginpage (WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	//locator for sigin button
	
	
	By username = By.xpath("//input[@type='text']");
	
	By password =By.xpath("//input[@type='password']");
	
	By loginbutton = By.xpath("//button[@name='login']");
	
	By forgetpass = By.xpath("//a[text()='Forgotten password?']");
	
	By createnewacc = By.xpath("//a[contains(text(),'Create New Account')]");
	
	
	
	
	//username input
	
	public void pagetitle(String stepDescription,String expectedResult,String titleGiven) {
		try {
			String title=driver.getTitle();
			if(titleGiven.equals(title)) {
				System.out.println(stepDescription + "-----" + expectedResult + "-----" + "Actualk result : The Page title is "+title);
			}else { 
				System.out.println("Page title is not same as in the UI");
			}
		} catch (Exception e) {
			System.out.println("Error Occure while verifying Title");
		}
	}
	}
	
	


