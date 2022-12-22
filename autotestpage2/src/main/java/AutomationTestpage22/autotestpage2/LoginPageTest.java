package AutomationTestpage22.autotestpage2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.annotations.VisibleForTesting;

public class LoginPageTest {
WebDriver driver;
	
	

	public  LoginPageTest(WebDriver driver) {
		
		this.driver =driver;
	}
	
	/**
	 * @author vmurrug
	 * @since 11.29.2022
	 * @param By class
	 * @param xpath locator
	 */
	
	By shopid = By.xpath("//*[contains(text(),'Shop')]");
	
	By menuid =By.xpath("(//a[@href='https://practice.automationtesting.in'])[2]");
	
	By sliderimg = By.xpath("//*[contains(@class,'n2-ss-slide-background-image n2-ss-slide-fill n2-ow')]");
	
	/**
	 * @param pageurl
	 * @param page verify
	 * 
	 * 
	 */
	
	public void pageurl(String step1descrip,String resulturl,String actualgiven) {
		try {
			driver.get(resulturl);
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
	 * @param Click on Shop menu Button
	 * @param Step1Descrip
	 * @param click button
	 */
	public boolean ShopMenuButton(String stepDescription,String expectedResults) {
		try {	
			boolean ShopButton=driver.findElement(shopid).isDisplayed();
			if (ShopButton==true) {
				driver.findElement(shopid).click();
				System.out.println(stepDescription + expectedResults);
				System.out.println("Successfully Clicked");
				return true;
			}else {
				System.out.println("Clicked Is Unsuccessful");
			}	
		} catch (Exception e) {
			System.out.println("Error Occured while Click In to ShopMenu Button");
		}return false;
	}
	/**
	 * @param stepDescription
	 * @param expectedResults
	 * @return HomeButton Clik
	 */
	public boolean HomeButton(String stepDescription,String expectedResults) {
		try {	
			boolean Homekey=driver.findElement(menuid).isDisplayed();
			if (Homekey==true) {
				driver.findElement(menuid).click();
				System.out.println(stepDescription + expectedResults);
				System.out.println("Successfully Clicked");
				return true;
			}else {
				System.out.println("Clicked Is Unsuccessful");
			}
		} catch (Exception e) {
			System.out.println("Error Occured while Click In to Menu Button");
		}return false;
	}	
	
	/**
	 * @return alret windows clicking
	 * @param StepDescp
	 * @param Expected
	 */
	public void alretkey(String StepDescp,String Expected) {
		try {
			Alert alert = driver.switchTo().alert();
			
			String alretwindow = driver.switchTo().alert().getText();
			alert.dismiss();
			System.out.println(alretwindow);
			System.out.println("Alert clicked successfully");
			System.out.println(StepDescp + Expected);
		} catch (Exception e) {
			System.out.println("While doesnt Click alret windows");
		}
		
	}
	/**
	 * @param StepDescription
	 * @param ExpectedResult
	 * @return Sliders size 
	 */
	
	public boolean Sliderspage(String StepDescription,String ExpectedResult) {
		try {
			List<WebElement> sliders =driver.findElements(sliderimg);
			int slidersize = sliders.size();
			if (slidersize==3) {
				System.out.println(StepDescription + ExpectedResult);
				System.out.println("Home page has Three Sliders only");
			}else {
				System.out.println("Home page has Doesn't Three Sliders only");
			}	
		} catch (Exception e) {
			System.out.println("While three Sliders not in Windows");
		}return false;
	}

}
