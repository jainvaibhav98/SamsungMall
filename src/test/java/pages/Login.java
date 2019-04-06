package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import utilities.Helper;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@type='button' and @title='Login']")
	WebElement LoginIcon;
	@FindBy(xpath = "(//a [text()='Log-In'])[2]")
	WebElement LoginButton;
	@FindBy(xpath = "//input[@id='iptLgnPlnID']")
	WebElement EnterUname;

	@FindBy(xpath = "//input[@id='iptLgnPlnPD']")
	WebElement EnterPassword;
	@FindBy(xpath = "//input[@id='remIdChkYN'][1]")
	WebElement Remember;
	@FindBy(xpath = "//button[@id='signInButton']")
	WebElement signIn;

	public void login(String userName, String Password) {

		LoginIcon.click();
		Actions act = new Actions(driver);
		act.moveToElement(LoginButton).click().perform();

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EnterUname.sendKeys(userName);

		EnterPassword.sendKeys(Password);
		try {
			Remember.click();
		} catch (Exception e) {
			System.out.println("Remember check box not tested");
		}

		signIn.click();

	}
}
