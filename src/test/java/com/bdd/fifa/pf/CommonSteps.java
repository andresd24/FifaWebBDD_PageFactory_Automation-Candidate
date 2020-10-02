package com.bdd.fifa.pf;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import webpages.BasePage;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.And;
import org.openqa.selenium.WebDriver;

public class CommonSteps {

   BasePage basePage;
   
   public CommonSteps() {
	   basePage = new BasePage();
   }
   
   @Given("^The user opens a Browser and navigates to the Fifa 2020 app root URL$") 
   public void goToFifa2020Site() throws MalformedURLException{
		
	   basePage.openBrowser();
	   
   }
	
   @And("^The user closes the browser session$") 
   public void closeBrowserSession() {   

	   basePage.closeBrowser();
	   
   }
	
}
