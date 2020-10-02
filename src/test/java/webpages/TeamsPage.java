package webpages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;

public class TeamsPage extends BasePage {
	
	@FindBy(xpath = "//li/a[@href='/teams']")
	private WebElement teamsNavBarLink;
	
	@FindBy(xpath = "//teams/div/h1")
	private WebElement teamsPageTitle;
	
	public TeamsPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnTeamsNavBarLink() {
		
	    teamsNavBarLink.click();
		
	}
	
	public String getTeamsSectionHeaderText() {     
		
	    return teamsPageTitle.getText();
	   
	}
	
}