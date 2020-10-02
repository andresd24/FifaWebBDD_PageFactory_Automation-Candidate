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
   
   @Given("^The user opens a browser window$") 
   public void openBrowserWindow() throws MalformedURLException, InterruptedException{
		
	   basePage.startBrowser();
	   
   }
   
   @Given("^The user navigates to the Fifa app root URL$") 
   public void goToFifa2020Site() throws MalformedURLException, InterruptedException{
		
	   basePage.navigaateToHomePage();
	   
   }
	
   @And("^The user closes a browser window$") 
   public void closeBrowserSession() {   

	   basePage.closeBrowser();
	   
   }
	
}
