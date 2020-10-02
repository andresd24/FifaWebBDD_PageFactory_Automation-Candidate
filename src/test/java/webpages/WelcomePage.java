package webpages;

import webpages.Helper;
import webpages.BasePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage {

   //Locators

   @FindBy(xpath = "//p[@class='btn-toolbar']/a[contains(@class,'btn-primary')]")
   private WebElement teamsButton;

   @FindBy(css = "p.btn-toolbar > a.btn-success")
   private WebElement adminsButton;

   @FindBy(css = "p.btn-toolbar > a.btn-warning")
   private WebElement contactUsButton;

   @FindBy(css = "ul.navbar-right > li > a[href='/signup']")
   private WebElement signUpLink;

   @FindBy(css = "ul.navbar-right > li > a[href='/login']")
   private WebElement loginLink;

   @FindBy(css = "li.dropdown > a.dropdown-toggle")
   private WebElement topRightNavBarDropdownMenuTitleLink;

   @FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]/li[1]/a[@href='/admin-panel']")
   private WebElement topRightNavBarDropdownControlPanelNameLink;
   
   @FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]//a/span[contains(@class, 'glyphicon-log-out')]/parent::a")
   private WebElement topRightNavBarLogoutLink;
   

	Helper helper;
    
	public WelcomePage() {
    	
    	helper = new Helper();
		PageFactory.initElements(driver, this);
    	
    }

	public List<String> getTextsFromTheWelcomeMessage() {     
		
		List<String> textsList = new ArrayList<String>();
				
	    textsList.add(teamsButton.getText());
	    textsList.add(adminsButton.getText());
	    textsList.add(contactUsButton.getText());
	   
	    return textsList;
	   
	}
	
	public List<String> getLinksFromTheWelcomeMenu() {     
		
		List<String> linksList = new ArrayList<String>();
	   
	    linksList.add(teamsButton.getAttribute("href"));
	    linksList.add(adminsButton.getAttribute("href"));
	    linksList.add(contactUsButton.getAttribute("href"));
	   
	    return linksList;
	    
	}

	public void clickOnTheTopRightMenuRegisterButton() {
		
		signUpLink.click();
	}
	
	
	public String getUserFirstNameFromTopRightNavBarDropdownMenuTitleLink() throws InterruptedException {
		
		helper.waitForElementDisplay(topRightNavBarDropdownMenuTitleLink, 60, 2);

		return topRightNavBarDropdownMenuTitleLink.getText();
		
	}

	public void clickOnControlPanelTopMenuItemLink() {

		topRightNavBarDropdownControlPanelNameLink.click();
	}
		
	public String getControlPanelTextFromTopRightNavBarDropdownMenuLink() {
		
		topRightNavBarDropdownMenuTitleLink.click();
		
		helper.waitForElementDisplay(topRightNavBarDropdownControlPanelNameLink, 60, 2);

		return topRightNavBarDropdownControlPanelNameLink.getText();
		
	}

	public void logoutFromFifaPage() {
		
		topRightNavBarDropdownMenuTitleLink.click();
		topRightNavBarLogoutLink.click();
		
	}


}