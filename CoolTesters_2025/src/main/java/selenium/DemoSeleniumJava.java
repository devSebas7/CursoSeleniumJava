package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSeleniumJava {

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
		
		// Metodos del explorador
		String title = driver.getTitle();
		System.out.println(title);
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		Thread.sleep(2000);
		
		// Metodos de navegacion
		// driver.navigate().back();
		// Thread.sleep(2000);
		// driver.navigate().forward();
		// Thread.sleep(2000);
		// driver.navigate().refresh();
		
		
		// Verificar elemento desplegado en pantalla
		boolean itemDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		
		if (itemDisplayed) {
			System.out.println("El articulo esta desplegado");
		}
		
		// Obtener el texto de un WebElement
		String prodName = driver.findElement(By.className("inventory_item_name")).getText();
		
		boolean prod = prodName.contains("Sauce Labs Backpack");
		if (prod) {
			System.out.println("El nombre del producto es correcto");
		} else {
			System.out.println("ERRO: Producto incorrecto");
		}
		
		// DropDowns
		Select drpdwnFilter = new Select(driver.findElement(By.className("product_sort_container")));
		drpdwnFilter.selectByVisibleText("Price (low to high)");
		
		Thread.sleep(2000);
		
		// Cerrar navegador
		// driver.close(); // Cierra la ventana o pestaña actual
		driver.quit(); // Cierra todas las ventanas o pestañas creadas por el WebDriver
		
	}

}
