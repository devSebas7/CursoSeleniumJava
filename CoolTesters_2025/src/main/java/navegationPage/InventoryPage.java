package navegationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class InventoryPage {
	public InventoryPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// InventoryPage WebElements
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addCartBtn;
	
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeCartBtn;
	
	public boolean verifyRemoveButton() {
		WrapClass.click(addCartBtn);
		return WrapClass.isDisplayed(removeCartBtn);
	}
}