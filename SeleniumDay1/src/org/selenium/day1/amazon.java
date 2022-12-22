package org.selenium.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmurrug\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		By shopid = By.xpath("//*[contains(text(),'Shop')]");
		
		By menuid =By.xpath("(//a[@href='https://practice.automationtesting.in'])[2]");
		
		By sliderimg = By.xpath("//*[contains(@class,'n2-ss-slide-background-image n2-ss-slide-fill n2-ow')]");
		
		By threearivels =By.xpath("//img[@loading='lazy']");
		
		By seleniumRuby =By.xpath("//img[@alt='Selenium Ruby']");
		
		By AddtoBascket =By.xpath("//button[@type='submit']");
		
		By addtocard = By.xpath("//span[@class='cartcontents']");
		
		By description = By.xpath("//a[@href='#tab-description']");
		
		By descdetails = By.xpath("//h2[text()='Product Description']");
		
		By productdetails = By.xpath("(//*[contains(text(),'The Selenium WebDriver')])[2]");
		
		By review = By.xpath("//a[@href='#tab-reviews']");
		
		By reviewtitle= By.xpath("//h2[@class='woocommerce-Reviews-title']");
		
		By userreview=By.xpath("//p[@class='woocommerce-noreviews']");
		
		By NoofRows=By.xpath("//table[@class='shop_table shop_table_responsive cart']/thead/tr/th");
		
		By NoofColoumn =By.xpath("//table[@class='shop_table shop_table_responsive cart']/tbody/tr");
	
		driver.findElement(shopid).click();
		driver.findElement(menuid).click();
		driver.findElement(seleniumRuby).click();
		System.out.println("image sucessfully clicked");
		String previousCount = driver.findElement(addtocard).getText();
		System.out.println(previousCount);
		String[] splitprevious=previousCount.split("");
		System.out.println(splitprevious[0]);
		String item =splitprevious[0];
		int itemnumber=Integer.parseInt(item);
		driver.findElement(AddtoBascket).click();
		String currentCount = driver.findElement(addtocard).getText();
		System.out.println(currentCount);	
		String[] splitcurent=currentCount.split("");
		System.out.println(splitcurent[0]);
		String newitem =splitcurent[0];
		int itemnumbernew = Integer.parseInt(newitem);
		System.out.println("current cart list:"+ itemnumbernew);
		driver.findElement(description).click();
		System.out.println("The image description details clicked successfully");
		List<String> allParagraphsValues = new ArrayList<String>();
		String	prod=driver.findElement(descdetails).getText();
		allParagraphsValues.add(prod);
		String prod2=driver.findElement(productdetails).getTagName();
		allParagraphsValues.add(prod2);	
		driver.findElement(review).click();
		previousCount =driver.findElement(review).getText();
		System.out.println(previousCount);
		String[] splitprevious1=previousCount.split("");
		System.out.println(splitprevious1[9]);
		String item1 =splitprevious1[9];
		int itemnumber1=Integer.parseInt(item1);
		List<String> allreviews = new ArrayList<String>();
		String reviewtitle1=driver.findElement(reviewtitle).getText();
		String userreviewdetails=driver.findElement(userreview).getText();
		allreviews.add(reviewtitle1);
		allreviews.add(userreviewdetails);
		System.out.println("reviewtag" + reviewtitle1 + userreviewdetails);
		driver.findElement(AddtoBascket).click();
		driver.findElement(addtocard).click();
		List<WebElement> rows = driver.findElements(NoofRows);
		List<WebElement> coloumn =driver.findElements(NoofColoumn);
		int sizeofrows= rows.size();
		int sizeofcoloumn = coloumn.size();
		for (int row = 0; row < sizeofrows; row++) {
			List < WebElement > Columns_row = rows.get(row).findElements(By.tagName("th"));
			int columns_count = Columns_row.size();
			System.out.println("Number of cells In Row " + row + " are " + columns_count);
			for (int coloumn1 = 0; coloumn1 < sizeofcoloumn; coloumn1++) {
				String celtext = Columns_row.get(coloumn1).getText();
				System.out.println("Cell Value of row number " + row + " and column number " + coloumn1 + " Is " + celtext);
			}
			System.out.println("-------------------------------------------------- ");
		}
		
	
		
		
		

	}

}
