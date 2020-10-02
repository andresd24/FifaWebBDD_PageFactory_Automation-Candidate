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
		
	public void openBrowser() throws MalformedURLException, InterruptedException{

//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities	);	ç
		driver = new FirefoxDriver();
    	//driver.get("http://localhost:4200/"); 
    	driver.manage().window().fullscreen();
    	driver.navigate().to("http://localhost:4200/");
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	setWebDriver(driver);
	}
	
	public void closeBrowser() {
		
		//driver.quit();
	}
	

}

