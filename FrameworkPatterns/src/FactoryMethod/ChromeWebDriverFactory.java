package FactoryMethod;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChromeWebDriverFactory implements WebDriver  {
	
//	private String pathToBinary;
//	private static final String defaultResoursePath = "browser/chrome/chromedriver.exe";

	public WebDriver ChromeWebDriver (WebDriver driver1) {
		
				
		//this.pathToBinary = ResourceUtils.getResourceAsTempFile(
			//	defaultResoursePath).getAbsolutePath();
		
		return driver1; 
		
	}

	public ChromeWebDriverFactory(String pathToBinary) {
	//	this.pathToBinary = pathToBinary != null && !pathToBinary.isEmpty() ? ResourceUtils
			//	.getResourceAsTempFile(pathToBinary).getAbsolutePath()
		//	: ResourceUtils.getResourceAsTempFile(defaultResoursePath)
				//		.getAbsolutePath();
		
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.ta.jtestcore.runner.config.factory.WebDriverFactory#
	 * createWebDriver()
	 */
	@Override
	public synchronized ChromeDriver createWebDriver() {
		DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
				pathToBinary);
		FixedChromeDriver chromeDriver = new FixedChromeDriver(chromeCapabilities);
		return chromeDriver;
	}

	@Override
	public synchronized ChromeDriver createWebDriver(
			DesiredCapabilities extraCapabilities) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
				pathToBinary);
		FixedChromeDriver chromeDriver = new FixedChromeDriver(DesiredCapabilities
				.chrome().merge(extraCapabilities));
		return chromeDriver;
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
	

}
