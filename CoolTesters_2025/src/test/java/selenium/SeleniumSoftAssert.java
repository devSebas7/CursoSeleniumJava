package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SeleniumSoftAssert {
	@Test
	public void testsoftassert() {
		SoftAssert softAssert = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		String badTitle = "my store";
		
		softAssert.assertEquals(actualTitle, badTitle);
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		// assertAll() reporta a TestNG cuales SoftAsserts fallaron
		softAssert.assertAll();
	}
	
}
