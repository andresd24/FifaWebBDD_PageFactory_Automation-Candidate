package com.bdd.fifa.pf;

import static org.junit.Assert.assertEquals;

import webpages.StorePage;
import webpages.TeamsPage;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class SubContainerPagesSteps { 
	  
	   TeamsPage teamsPage;
	   StorePage storePage;
	   
	   public SubContainerPagesSteps(){
		   teamsPage = new TeamsPage();
		   storePage = new StorePage();
	   }
		
	   @When("^The user clicks on Teams option of the Navigaion Bar$") 
	   public void clickOnTeamsSubContainerSectionHeaderText() {   
				
		   teamsPage.clickOnTeamsNavBarLink();
	   }
	   
	   @Then("^The Teams Sub Page must load and show 'Teams' in the Header$") 
	   public void validateTextTeamsSubContainerSectionHeaderText() throws InterruptedException {   
		   
		   assertEquals("The Teams Sub Section doesn't contain the correct header text", "Teams", teamsPage.getTeamsSectionHeaderText());
	   }
	   	
	   
	   @When("^The user presses delayed button and waits 20 seconds the text to appear$")
	   public void userPressesDelayedButtonAndWaitsForTextToAppear() throws InterruptedException {   
		   
		   storePage.pressDelayedButtonAndWaitForTextToAppear();
	   }
	   	
	} 
