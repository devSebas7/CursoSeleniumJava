package commonMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WrapClass {
	public static void click(WebElement webelementUI) {
		webelementUI.click();
	}
	
	public static void sendKeys(WebElement webelementUI, String textToSend) {
		webelementUI.sendKeys(textToSend);
	}
	
	public static String getText(WebElement webelementUI) {
		return webelementUI.getText();
	}
	
	public static boolean isDisplayed(WebElement webelementUI) {
		return webelementUI.isDisplayed();
	}
	
	public static void takeScrennshot(WebDriver webdriver, String testCaseName) {
		File srcFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath = "./test-output/ExecutionResults";
		
		try {
			FileHandler.createDir(new File(screenshotPath));
			FileHandler.copy(srcFile, new File (screenshotPath + File.separator + testCaseName + ".png"));
		}catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void driverGet(WebDriver driver, String domain) {
		driver.get(domain);
	}
	
	public static void driverQuit(WebDriver driver) {
		driver.quit();
	}
}
