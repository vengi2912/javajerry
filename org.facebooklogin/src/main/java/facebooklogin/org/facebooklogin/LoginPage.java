package facebooklogin.org.facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

        WebDriver driver;
	
	
	public LoginPage (WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	//locator for sigin button
	
	
	By username = By.xpath("//input[@type='text']");
	
	By password =By.xpath("//input[@type='password']");
	
	By loginbutton = By.xpath("//button[@name='login']");
	
	By forgetpass = By.xpath("//a[text()='Forgotten password?']");
	
	By createnewacc = By.xpath("//a[contains(text(),'Create New Account')]");
	
	//page url verified
	/**@
	 * 
	 **/
	public void pageurl(String step1descrip,String resulturl,String actualgiven) {
		try {
			driver.get("https://www.facebook.com/");
			String url= driver.getCurrentUrl();
			if (actualgiven.equals(url)) {
				System.out.println(step1descrip + "......" + resulturl + "........" + "actual result url is" + url);
			} else {
				System.out.println("the page url is not same");
			}
		}
		catch (Exception e) {
			System.out.println("Error Occure while verifying url");
		}
	}
	
	/**
	 * Verify PAge title 
	 * @param stepDescription
	 * @param expectedResult
	 * @param titleGiven
	 * @author vmurrug
	 * @since  
	 */
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
		//usernamenamepassoword
		
		public void usernamemail(String mailid) {
			
		 driver.findElement(username).sendKeys(mailid);
			 
		}
		//password
		 
		 public void password(String pass) {
			 
			 driver.findElement(password).sendKeys(pass);
			 
		 }
		//login button
		 
		public void logbutton() {
			
			driver.findElement(loginbutton).click();
		}
		
		public boolean mailidverify(String StepDescription,String actual,String Excpedted) {
			try {
				driver.findElement(username).sendKeys(actual);
				String userelement = driver.findElement(username).getAccessibleName();
				if (userelement.equals(Excpedted)) {
					System.out.println(StepDescription +" \n" + Excpedted);
					System.out.println( "\b Actual Result" );
					System.out.println("Entered Email address is correct and email id is " + userelement);
					return true;			
				}else {
					System.out.println("email id is incorrect");
				}			
			} catch (Exception e) {	
				System.out.println("Error accoured");
			}	
			return false;	
		}
		
		public boolean passwordverify(String StepDescription,String actual,String Excpedted) {
			try {
				driver.findElement(password).sendKeys(actual);
				String pass = driver.findElement(password).getAccessibleName();
				if(pass.equals(Excpedted)) {
					System.out.println(StepDescription +" \n" + Excpedted);
					System.out.println( "\b Actual Result" );
					System.out.println("Entered password is correct and pass is " + pass);
					return true;
				}else {
					System.out.println("password is in correct");
				}		
			} catch (Exception e) {
				System.out.println("Error for password Entred");
			}	
			return false;	
		}
		public boolean signInButton(String stepDescription,String expectedResults) {
			try {
				
			boolean loginButton=driver.findElement(loginbutton).isDisplayed();
			if (loginButton==true) {
				driver.findElement(loginbutton).click();
				System.out.println("Successfully Logged In");
				return true;
			}else {
				System.out.println("Login Is Unsuccessful");
			}
			
			} catch (Exception e) {
				System.out.println("Error Occured while Login In to next Page");
			}
			
			return false;
		}
		public boolean forgetpass(String stepDescription,String expectedResults) {
			try {
				
			boolean forgetpassword=driver.findElement(forgetpass).isDisplayed();
			if (forgetpassword==true) {
				driver.findElement(forgetpass).click();
				System.out.println("Successfully clicked");
				return true;
			}else {
				System.out.println("forget click  Unsuccessful");
			}
			
			} catch (Exception e) {
				System.out.println("Error Occured while forgetpass not click");
			}
			
			return false;
		}

	
			
	}
	

