package webpages;

import java.net.MalformedURLException;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class BasePage {
	
	protected static WebDriver driver;
	
	public void setWebDriver(WebDriver driver) {
		BasePage.driver = driver;
	    
	}
		
	public void startBrowser() throws MalformedURLException, InterruptedException{

		driver = new FirefoxDriver();
    	driver.manage().window().fullscreen();
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	setWebDriver(driver);
	}

	public void navigateToHomePage() throws MalformedURLException, InterruptedException{

    	driver.navigate().to("http://localhost:4200/");
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void closeBrowser() {
		driver.quit();

	}
	

}

