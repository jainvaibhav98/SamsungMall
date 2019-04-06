package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Helper {
	WebDriver driver;
	
	

	public WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Selenium setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://www.samsung.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public void quit() {
		driver.quit();
	}

	public static void  GetScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File images = new File("./Screenshots/" + System.currentTimeMillis() + ".jpeg");
		try {
			Files.copy(src, images);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void Logout() {

	}
}
