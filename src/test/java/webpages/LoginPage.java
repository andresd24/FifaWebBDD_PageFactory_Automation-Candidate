package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {
		
	
	// locators
	
	@FindBy(xpath = "//ul[contains(@class, 'navbar-right')]/li/a[contains(@href, '/login')]")
	private WebElement topRightNavBarMenuLinkWhenLoggedOut;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTextBox;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordTextBox;
	
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement loginButton;

	public LoginPage() {
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnTheTopRightMenuLoginButton() {
		
	    topRightNavBarMenuLinkWhenLoggedOut.click();
	}
	
	public void fillOutTheLoginFormAndSubmitIt(String email, String password) {

	    emailTextBox.sendKeys(email);
	    passwordTextBox.sendKeys(password);
	    
	    loginButton.click();
	}
	
}