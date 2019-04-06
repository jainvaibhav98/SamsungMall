package UnitTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.Helper;

public class TakeScreenShot {
	
	

	
  @Test
  public void takeScreenshot() {
	  Helper set = new Helper();
	  set.setup();
	  set.GetScreenshot();
	  
  }
}
