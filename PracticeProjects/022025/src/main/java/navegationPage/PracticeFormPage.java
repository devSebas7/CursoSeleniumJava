package navegationPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class PracticeFormPage {
	public PracticeFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// PracticeFormPage Elements
	@FindBy(id = "firstName")
	private WebElement firstNameInput;
	
	@FindBy(id = "lastName")
	private WebElement lastNameInput;
	
	@FindBy(id = "userEmail")
	private WebElement userEmailInput;
	
	@FindBy(xpath = "//label[starts-with(@for, 'gender-radio-')]")
    private List<WebElement> radioLabels;
	
	@FindBy(id = "userNumber")
	private WebElement userNumberInput;
	
	@FindBy(id = "dateOfBirthInput")
	private WebElement dateOfBirthInput;
	
	@FindBy(id = "subjectsInput")
	private WebElement subjectsInput;
	
	@FindBy(xpath = "//label[starts-with(@for, 'hobbies-checkbox-')]")
	private List<WebElement> checkboxLabels;
	
	@FindBy(id = "uploadPicture")
	private WebElement uploadPictureFile;
	
	@FindBy(id = "currentAddress")
	private WebElement currentAddressTextArea;
	
	@FindBy(id = "react-select-3-input")
	private WebElement stateList;
	
	@FindBy(id = "react-select-4-input")
	private WebElement cityList;
	
	@FindBy(id = "submit")
	private WebElement submitBtn;
	
	public void fillForm(String fistName, String lastName, String email, String number, String dateOfBirth, String[] subjects, String address, String state, String city) {
		WrapClass.sendKeys(firstNameInput, fistName);
		WrapClass.sendKeys(lastNameInput, lastName);
		WrapClass.sendKeys(userEmailInput, email);
		WrapClass.click(radioLabels.get(0));
		WrapClass.sendKeys(userNumberInput, number);
		WrapClass.sendKeys(dateOfBirthInput, dateOfBirth);
		for(int i = 0; i < subjects.length; i++) {
			WrapClass.sendKeys(subjectsInput, subjects[i]);
		}
		WrapClass.click(checkboxLabels.get(0));
		WrapClass.click(checkboxLabels.get(2));
		WrapClass.sendKeys(currentAddressTextArea, address);
		WrapClass.sendKeys(stateList, state);
		//WrapClass.sendKeys(cityList, city);
		WrapClass.click(submitBtn);
	}
}
