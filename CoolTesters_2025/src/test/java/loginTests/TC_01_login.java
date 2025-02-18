package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.DriverSetup;
import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navegationPage.LoginPage;

public class TC_01_login {
	// Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	// PageObjects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void StartPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	@Test
	public void LoginTest_01() {
		// Step 1 : Login
		loginPage.Login(GlobalVariables.USERNAME, GlobalVariables.PWD);
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScrennshot(driver, "LoginTest_01");
		driver.quit();
	}
}
