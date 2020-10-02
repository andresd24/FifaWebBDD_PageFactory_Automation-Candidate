// to be created by candidate (challenge 2):

package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends BasePage {
	
	@FindBy(css = "ul.navbar-nav > li > a[href='/store']")
	private WebElement storeNavBarLink;

	@FindBy(id = "buttonDelay")
	private WebElement delayedButton;

	@FindBy(id = "textDelay")
	private WebElement delayedText;
	
	int interval = 0;
	int timeElapsed = 0;		
	
	Helper helper;
	
	public StorePage() {
		helper = new Helper();
	    PageFactory.initElements(driver, this);
		
	}

	public void pressDelayedButtonAndWaitForTextToAppear() {
		
		delayedButton.click();
		
		helper.waitForElementDisplay(delayedText, 60, 2);
	}
	
	public void clickOnStoresNavBarLink() {
		
	    storeNavBarLink.click();		
	}
	

}





