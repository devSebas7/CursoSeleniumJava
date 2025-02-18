package InventoryTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.DriverSetup;
import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navegationPage.InventoryPage;
import navegationPage.LoginPage;

public class TC_03_VerifyRemoveButton {
	// Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	// PageObjects
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventoryPage = new InventoryPage(driver);
	
	@BeforeTest
	public void StartPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	@Test
	public void InventoryTest_03() {
		// Step 1 : Login
		loginPage.Login(GlobalVariables.USERNAME, GlobalVariables.PWD);
		
		// Step 2 : Verify remove button
		Assert.assertTrue(inventoryPage.verifyRemoveButton());
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScrennshot(driver, "InventoryTest_03");
		driver.quit();
	}
}
