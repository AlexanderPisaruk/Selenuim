package SingletonMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverSingleton {

	private static WebDriver driver; 
	
//	private WebdriverSingleton() {}
	
	
	public static WebDriver getInstance() {
		
		if (driver == null) {
				driver = new FirefoxDriver(); }
		
			//driver = new ChromeDriver(); }
			
		return driver; 
		
	}
	
	
	public static void closeDriver() {
		
		driver.quit(); 
		driver = null; 
		
		
	}
	
		
}
