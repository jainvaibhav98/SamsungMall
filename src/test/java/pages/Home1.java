package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Helper;

public class Home1 {
   
	@FindBy(xpath="//div[@class='s-nav-text' and text()='Galaxy S10+']")WebElement GalaxyS10 ;
	@FindBy(xpath="//div[@class='s-nav-text' and text()='Galaxy M']")WebElement GalaxyM;
	@FindBy(xpath="//div[@class='s-nav-text' and text()='Galaxy A']")WebElement GalaxyA;
	@FindBy(xpath="//div[@class='s-nav-text' and text()='QLED TV']")WebElement QLED;
	@FindBy(xpath="//div[@class='s-nav-text' and text()='Family Hub™']")WebElement FamilyHub;
	@FindBy(xpath="//h2[text()='Discover the Galaxy']") WebElement DiscoverGalaxyText;
	@FindBy(xpath="(//button[@type='button' and @class='ho-product-3column-group__btn-play js-video js-pop-btn'])[1]") WebElement S10Video;
	
	@FindBy(xpath="//button[text()='Close']")WebElement S10CloseButton;
	
	
	public void TestHome1(WebDriver driver) throws InterruptedException
	{
		GalaxyS10.click();
		Thread.sleep(1000);
		Helper.GetScreenshot(driver);
		GalaxyM.click();
		Thread.sleep(1000);
		Helper.GetScreenshot(driver);
		GalaxyA.click();
		Thread.sleep(1000);
		Helper.GetScreenshot(driver);
		QLED.click();
		Thread.sleep(1000);
		Helper.GetScreenshot(driver);
		FamilyHub.click();
		Thread.sleep(1000);
		Helper.GetScreenshot(driver);
		
	}
	public void TestDiscover(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 2px solid black;');", DiscoverGalaxyText);
		S10Video.click();
		Thread.sleep(2000);
		Helper.GetScreenshot(driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
		driver.switchTo().defaultContent();
		S10CloseButton.click();
		
		
	}
	
}
