package webpages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage  {
		

	// locators
	
	@FindBy(name = "name")
	private WebElement firstNameTextBox;
	
	@FindBy(name = "surname")
	private WebElement lastNameTextBox;

	@FindBy(name = "email")
	private WebElement emailTextBox;
	
	@FindBy(name = "password")
	private WebElement passwordTextBox;
	
	@FindBy(name = "confirmPassword")
	private WebElement confirmPasswordTextBox;

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement registerButton;

	@FindBy(css = "register div div")
	private WebElement registrationReturnMessage;
	
	public RegisterPage() {
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    PageFactory.initElements(driver, this);
	
	}
			
	
	public void fillOutAnSubmitRegistrationFrom(String name, String surname, String email, String password, String passwordConfirmation) {
		   
	    firstNameTextBox.sendKeys(name);
	    lastNameTextBox.sendKeys(surname);
	    emailTextBox.sendKeys(email);
	    passwordTextBox.sendKeys(password);
	    confirmPasswordTextBox.sendKeys(passwordConfirmation);
	    
	    registerButton.click();

	}
	
	public String returnRegistrationMessage() throws InterruptedException {
		
		return registrationReturnMessage.getText();
	}
	

}
