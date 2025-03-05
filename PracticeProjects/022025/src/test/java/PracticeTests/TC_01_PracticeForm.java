package PracticeTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.DriverSetup;
import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navegationPage.PracticeFormPage;

public class TC_01_PracticeForm {
	WebDriver driver = DriverSetup.setupDriver();
	PracticeFormPage formPage = new PracticeFormPage(driver);
	
	@BeforeTest
	public void StartPage() {
		WrapClass.driverGet(driver, GlobalVariables.HOME_PAGE);
	}
	
	@Test
	public void PracticeTest_01() {
		formPage.fillForm(GlobalVariables.FIRST_NAME, GlobalVariables.LAST_NAME, GlobalVariables.EMAIL, 
						  GlobalVariables.NUMBER, GlobalVariables.DATE_OF_BIRTH, GlobalVariables.SUBJECTS, 
						  GlobalVariables.ADDRESS, GlobalVariables.STATE, GlobalVariables.CITY);
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScrennshot(driver, "PracticeFormTest_01");
		WrapClass.driverQuit(driver);
	}
}
