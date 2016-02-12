package Decorator;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Page.LoginPage;

public class Decorator implements WebDriver {

	
	protected WebDriver driver; 
	
	
	public Decorator(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public static void openQAserver () {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://videoportalqa.epam.com/login"); 	
		//driver.get(LoginPage.CurrentPageURL);
		
	}

	public static void openAutoQAserver () {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://videoportalautoqa.epam.com/login"); 	
				
	}
	
	public static void openPRODserver () {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://videoportal.epam.com/login"); 	
		
		
	}
	
	
	
}
