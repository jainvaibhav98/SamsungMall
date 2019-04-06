package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.LoginData;
import pages.Login;
import utilities.Helper;

public class logintest {
	Login log;
	WebDriver driver;
	Helper set;
	
	@BeforeMethod
	public void settest()
	{ set=   new Helper();
 	  driver= set.setup();
		
	}
	
	
	
	
  @Test (priority= 1 ,dataProvider="Logindata",dataProviderClass=LoginData.class)
  public void Userlogin(String Uname, String Upassword, String name) {
	 
	  log= PageFactory.initElements(driver, Login.class);
	  log.login(Uname, Upassword);
	  System.out.println(name+ " has logged in.");
  }
  

  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
	  
  }
}
