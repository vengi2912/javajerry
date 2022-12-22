package AutomationTestpage.org.automation.testpage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	

	public  LoginPage(WebDriver driver) {
		
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
	
	
	
	/**
	 * @param pageurl
	 * @param page verify
	 * 
	 * 
	 */
	
	public String pageurl(String step1descrip,String resulturl,String actualgiven) {
		try {
			driver.get(resulturl);
			String url= driver.getCurrentUrl();
			if (actualgiven.equals(url)) {
				System.out.println(step1descrip + "......" + resulturl + "........" + "actual result url is" + url);
				return url;
			} else {
				System.out.println("the page url is not same");
			}
		}
		catch (Exception e) {
			System.out.println("Error Occure while verifying url");
		}
		return null;
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
	 * @param StepDescription
	 * @param ExpectedResult
	 * @return three sliders image
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
	
	/**

	 * @param stepDesc
	 * @param expectedResult
	 * @return three arivels on page
	 */
	public boolean arivelspage(String stepDesc,String expectedResult){
		try {
			List<WebElement> arivels=driver.findElements(threearivels);
			int arivelsize =arivels.size();
			if (arivelsize==3) {
				System.out.println(stepDesc + "arivelpage has : " + arivelsize + expectedResult);
				System.out.println("The Arivels page have three-images only");	
			} else {
				System.out.println("arivel page  Doesn't have Three arivel only");
			}
		} catch (Exception e) {
			System.out.println("While three arivels not in Windows Error pop");
		}
		return false;
	}
	
	/**
	 * @param StepDesc
	 * @param expectedresult
	 * @return
	 */
	public boolean imagenavigate(String StepDesc,String expectedresult){
		try {
			boolean image=driver.findElement(seleniumRuby).isDisplayed();
			if (image==true) {
				driver.findElement(seleniumRuby).click();
				System.out.println("image sucessfully clicked");
				boolean basket=driver.findElement(AddtoBascket).isDisplayed();
				if (basket==true) {
					System.out.println("The next page will appear and we can addtobascket");
					System.out.println(StepDesc + expectedresult);	
					System.out.println(" Image should be clickable and shoul navigate to next page where user can add that book to his basket sucessfull");
				}else {
					System.out.println("nextpage will not appear and fail to add bascket");
				}
			}else {
				System.out.println("book image doesn't click");
			}
		} catch (Exception e) {
			System.out.println("While click on the image window Error!");
		}
		return false;
	}
	
	/**
	 * 
	 * @param stepDescription
	 * @param expectedResults
	 * @return
	 */
	public boolean addtobascket(String stepDescription, String expectedResults) {
		String previousCount = "", currentCount = "";
		try {
			boolean image=driver.findElement(seleniumRuby).isDisplayed();
			if (image==true) {
				driver.findElement(seleniumRuby).click();
				System.out.println("image sucessfully clicked");
				previousCount =driver.findElement(addtocard).getText();
				System.out.println(previousCount);
				String[] splitprevious=previousCount.split("");
				System.out.println(splitprevious[0]);
				String item =splitprevious[0];
				int itemnumber=Integer.parseInt(item);
				if (itemnumber==0) {
					boolean bascket=driver.findElement(AddtoBascket).isDisplayed();
					if (bascket==true) {
						driver.findElement(AddtoBascket).click();
						currentCount=driver.findElement(addtocard).getText();
						System.out.println(currentCount);	
						String[] splitcurent=currentCount.split("");
						System.out.println(splitcurent[0]);
						String newitem =splitcurent[0];
						int itemnumbernew = Integer.parseInt(newitem);
						System.out.println("current cart list:"+ itemnumbernew);
						if (itemnumber!=itemnumbernew) {
							System.out.println("current item succefully added to the cart");
							System.out.println(stepDescription + expectedResults);
						return true;	
						}
					}
				}
			}else {
				System.out.println("image not clicked");
			}
		} catch (Exception e) {
			System.out.println("failed to load addtobacket Error");
		}
		return false;
	}
	
	/**
	 * @param Stepdesc
	 * @param expected
	 * @param Description
	 * @return
	 */
	public boolean productdescription(String Stepdesc,String expected,List<String> Description) {
		try {
			boolean product =driver.findElement(description).isEnabled();
			if (product==true) {
				driver.findElement(description).click();
				boolean detailsproduct = driver.findElement(descdetails).isDisplayed();
				if (detailsproduct==true) {
					System.out.println("The image description details clicked successfully");
					List<String> allParagraphsValues = new ArrayList<String>();
					String	prod=driver.findElement(descdetails).getText();
					allParagraphsValues.add(prod);
					String prod2=driver.findElement(productdetails).getTagName();
					allParagraphsValues.add(prod2);	
					if (Description.equals(allParagraphsValues)) {
						System.out.println(Stepdesc + expected );
						System.out.println("Product details verify sucessfully");
						return true;
					} else {
						System.out.println(" Descrition details not matched");
					}
				}
			}
		} 
		catch (Exception e) {
			System.out.println("Error mismatching the descriotion details");
		}
		return false;
	}
	
	/**
	 * Review Details
	 * @param stepDescription
	 * @param expectedResults
	 * @param ReviewDescription
	 * @return No of Reviews and UserReview
	 */
	public boolean ReviewTag(String stepDescription, String expectedResults,List<String> ReviewDescription) {
		String previousCount = "", currentCount = "";
		try {
			// boolean reviewtag=driver.findElement(review).isDisplayed();
			
				driver.findElement(review).click();
				System.out.println("Reviewtag sucessfully clicked");
				previousCount =driver.findElement(review).getText();
				System.out.println(previousCount);
				String[] splitprevious=previousCount.split("");
				System.out.println(splitprevious[9]);
				String item =splitprevious[9];
				int itemnumber=Integer.parseInt(item);
				if (itemnumber!=0) {
					System.out.println("Total No Of Reviews: "+ itemnumber);
					boolean title=driver.findElement(reviewtitle).isDisplayed();
					if (title==true) {	
						List<String> allreviews = new ArrayList<String>();
						String reviewtitle1=driver.findElement(reviewtitle).getText();
						String userreviewdetails=driver.findElement(userreview).getText();
						allreviews.add(reviewtitle1);
						allreviews.add(userreviewdetails);
						System.out.println("reviewtag" + reviewtitle1 + userreviewdetails);
						if (allreviews.equals(ReviewDescription)) {
							System.out.println(stepDescription + expectedResults + ReviewDescription);
							return true;
						}else {
							System.out.println("Review title and user review not same");
						}
					}
				}else {
					System.out.println("No Reviews For In This Book");
					String	current1 =driver.findElement(review).getText();
					System.out.println(current1);
					String[] current=current1.split("");
					System.out.println(current[9]);
					String item1 =current[9];
					int itemnumber1=Integer.parseInt(item1);
					System.out.println("No of Reviews: " + itemnumber1);
				}
			

		} catch (Exception e) {
			System.out.println("failed to load addtobacket Error");
		}
		return false;
	}
	
	/**
	 * 
	 * 
	 * @param StepDesc
	 * @param Result
	 * @return
	 */
	public boolean MenuItemPriceProductDetails(String StepDesc,String Result) {
		try {
			boolean addtobascket = driver.findElement(AddtoBascket).isDisplayed();
			if (addtobascket==true) {
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
				}return true;
			} 
			else {
				System.out.println("Table not fatched");
			}
		}
		catch (Exception e) {
			System.out.println("Error Accour While Checking the Price and Product");
		}
		return false;
	}	
	
	
	
	
	
	
	
	
	
}