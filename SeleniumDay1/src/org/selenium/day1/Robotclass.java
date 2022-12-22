package org.selenium.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import net.bytebuddy.asm.Advice.Enter;

public class Robotclass {

	private static final int Enter = 0;

	public static void main(String[] args) throws AWTException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver mouse = new ChromeDriver();
		
		Robot robot =new Robot();
		
		
		//mouse.get("https://accounts.google.com/v3/signin/identifier?dsh=S1628214302%3A1669298807334973&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAsg70t_TT2pmO_Hvj7atvJXBIIA-o8j2-EnD4u4jVAqRBrjzsZn33j53xBRqvDb6UnSrA0lyQ");
		
		mouse.get("https://www.cricbuzz.com/");
		
		//mouse.findElement(By.xpath("//input[@type='email']")).sendKeys("vengi2912@gmail.com");
		
		//robot.keyPress(Enter);
		
		//robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
		
		
		
		
		Thread.sleep(3000);
		
		mouse.close();

	}

}
