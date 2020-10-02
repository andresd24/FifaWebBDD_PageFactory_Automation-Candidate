package webpages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class BasePage {
	
	protected static WebDriver driver;
	
	public void setWebDriver(WebDriver driver) {
		BasePage.driver = driver;
	    
	}
		
	public void openBrowser() throws MalformedURLException{

//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities	);	ç
		driver = new FirefoxDriver();
    	driver.get("http://localhost:4200/"); 
    	setWebDriver(driver);
	}
	
	public void closeBrowser() {
		
		//driver.quit();
	}
	

}

