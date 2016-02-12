package Decorator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CustomDriverTest {
	
	
	@Test(enabled = true)
	public void openQAserver() {
		
		WebDriver driver = new FirefoxDriver(); 
		
		WebDriver customDriver = new Decorator(driver); 
		
		((CustomDriverTest) customDriver).openQAserver(); 
		
		
		
	}
	
	

}
