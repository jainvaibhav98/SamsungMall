package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Home1;
import pages.HomePageMethods;
import utilities.Helper;

public class MainTCs {
	WebDriver driver;
	Helper help;
	HomePageMethods home;
	Home1 home1;
	
	@BeforeClass
	public void settest() {
		help = new Helper();
		driver = help.setup();
		home = PageFactory.initElements(driver, HomePageMethods.class);
		home1= PageFactory.initElements(driver, Home1.class);
	}

	@Test(priority = 0)
	public void VerifyPage() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Samsung India | Mobile | TV | Home Appliances"));

	}

	@Test(priority = 1)
	public void LogoTest() {
		home.TestLogoVisibility();
		Assert.assertTrue(home.TestClickableLogo());
		Assert.assertTrue(home.TestClickLogo());
		Assert.assertTrue(home.TestLogoText());
	}

	@Test(priority = 2)
	public void Link() {
		home.TestMobileLinks(home.getMobileLinks(), home.getMobile());
		home.TestMobileLinks(home.getTVLinks(), home.getTV());
		home.TestMobileLinks(home.getApplianceLinks(), home.getAppliance());
		home.TestMobileLinks(home.getComputingLink(), home.getComputing());
		home.TestMobileLinks(home.getSupportLink(), home.getSupport());
		home.TestMobileLinks(home.getLoginLink(), home.getLogin());
	}
	
	@Test(priority=3)
	public void Home1Test() throws InterruptedException
	{
		home1.TestHome1(driver);
		
	}
	@Test (priority=4)
	public void DiscoverTest() throws InterruptedException
	{
		home1.TestDiscover(driver);
		
	}
	
}
