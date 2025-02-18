package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiverpoolLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.liverpool.com.mx");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div[2]/button/svg")).click();
	}

}
