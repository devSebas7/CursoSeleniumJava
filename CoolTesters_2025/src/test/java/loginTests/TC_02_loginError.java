package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.DriverSetup;
import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navegationPage.LoginPage;

public class TC_02_loginError {
	// Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	// PageObjects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void StartPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	@Test
	public void LoginTest_02() {
		// Step 1 : Login
		loginPage.Login(GlobalVariables.USERNAME_LOCKED, GlobalVariables.PWD);
		// Step 2 : Validar error en pagina
		Assert.assertTrue(loginPage.validateLockedUserError());
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScrennshot(driver, "LoginTest_02");
		driver.quit();
	}
}
