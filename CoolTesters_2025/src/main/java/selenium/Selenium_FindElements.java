package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FindElements {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		// Obteniedo WebElements de la pagina web
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginBtn.click();
		
		List<WebElement> prodLists = driver.findElements(By.className("inventory_item_description"));
		
		System.out.println("El numero de productos es: " + prodLists.size());
		
		String segundoProd = prodLists.get(1).getText();
		System.out.println(segundoProd);
		
		String tercerProd = prodLists.get(2).getText();
		System.out.println(tercerProd);
		
		driver.quit();

	}

}
