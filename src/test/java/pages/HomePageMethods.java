package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePageMethods {
	WebDriver driver1;

	public HomePageMethods(WebDriver driver) {
		this.driver1 = driver;
	}

	@FindBy(xpath = "//a[@href='/in/']")
	WebElement samsungLogo;

	@FindBy(xpath = "(//a[@href='#' and text()='MOBILE'])[1]")
	WebElement Mobile1;
	@FindBy(xpath = "(//div[@class='gb-gnb__drop-desktop'])[1]//a")
	List<WebElement> MobileLinks;
	@FindBy(xpath = "(//a[@href='#' and text()='TV & AV'])[1]")
	WebElement TV1;
	@FindBy(xpath = "(//div[@class='gb-gnb__drop-colgroup'])[2]//a")
	List<WebElement> TVLinks;
	@FindBy(xpath = "(//a[@href='#' and text()='APPLIANCES'])[1]")
	WebElement Appliance1;
	@FindBy(xpath = "(//div[@class='gb-gnb__drop-colgroup'])[3]//a")
	List<WebElement> AppliancesLink;
	@FindBy(xpath = "(//a[@href='#' and text()='COMPUTING'])[1]")
	WebElement Computing1;
	@FindBy(xpath = "(//div[@class='gb-gnb__drop-colgroup'])[4]//a")
	List<WebElement> ComputingLink;
	@FindBy(xpath = "(//a[@href='#' and text()='SUPPORT'])[2]")
	WebElement Support1;
	@FindBy(xpath = "(//div[@class='gb-gnb__drop-colgroup'])[5]//a")
	List<WebElement> SupportLink;
	@FindBy(xpath = "//button[@type='button' and @title='Login']")
	WebElement LoginIcon;
	@FindBy(xpath = "(//div[@class='gb-gnb__drop-colgroup'])[6]//a")
	List<WebElement> LoginLink;

	public void TestLogoVisibility() {
		Assert.assertTrue(samsungLogo.isDisplayed());

	}

	public boolean TestClickableLogo() {
		WebDriverWait wait = new WebDriverWait(driver1, 20);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(samsungLogo));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean TestClickLogo() {
		samsungLogo.click();
		if (driver1.getTitle().equalsIgnoreCase("Samsung India | Mobile | TV | Home Appliances")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean TestLogoText() {
		if (samsungLogo.getText().equals("Samsung")) {
			return true;

		} else {
			return false;
		}
	}

	public boolean TestMobileModule() {
		return (Mobile1.isDisplayed());
	}

	public List getMobileLinks() {
		return MobileLinks;
	}

	public List getTVLinks() {
		return TVLinks;
	}

	public List getApplianceLinks() {
		return AppliancesLink;
	}

	public List getComputingLink() {
		return ComputingLink;
	}

	public List getSupportLink() {
		return SupportLink;
	}

	public List getLoginLink() {
		return LoginLink;
	}
	
	public WebElement getMobile(){
		return Mobile1;
	}
	
	public WebElement getTV(){
		return TV1;
	}
	public WebElement getAppliance(){
		return Appliance1;
	}
	public WebElement getComputing(){
		return Computing1;
	}
	public WebElement getSupport(){
		return Support1;
	}
	public WebElement getLogin(){
		return LoginIcon;
	}

	public void TestMobileLinks(List <WebElement> lst, WebElement ele) {
		Actions act = new Actions(driver1);
		JavascriptExecutor js = (JavascriptExecutor) driver1;
		for (WebElement webElement : lst) {
			act.moveToElement(ele).moveToElement(webElement).build().perform();
			js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 2px solid black;');",
					webElement);

		}
		
		
		

	}

}
