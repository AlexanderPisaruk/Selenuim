package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.LoginPage;
import Page.ProfilePage;
import Page.ViewVideoPage;

import org.openqa.selenium.interactions.Actions;


public class ActionsTestingExample {
		
	WebDriver driver = new FirefoxDriver(); 
	
	@Test(description = "Open Login page", priority = 0)
	public void OpenLoginPage() throws InterruptedException {
		driver.get(LoginPage.CurrentPageURL);
		
		Assert.assertTrue(driver.getCurrentUrl().equals(LoginPage.CurrentPageURL));
				
	} 
		
	@Test(description = "LogIn action", priority = 10)
	public void loginAction() throws InterruptedException{
		LoginPage lp = new LoginPage(driver); 
		
		lp.setCredentials("Auto_EPM-TUBE_UploadBroadcast@epam.com", "YFY!cFb2e3AD*cJta@");
	
		Assert.assertTrue(driver.getCurrentUrl().equals(HomePage.CurrentPageURL));
	}
	
	
	
	@Test(description = "open flowplayer's page", priority = 20)
	public void loginViaJavascript() {
	JavascriptExecutor jsExec = ((JavascriptExecutor) driver);
	Object response = jsExec.executeScript("document.location.href = 'https://videoportalqa.epam.com/video/PJ6LjxoX'"); 

	
	};
	
	
	@Test(description = "Start Video", priority = 30)
	public void playVideo() {
	
		ViewVideoPage vv = new ViewVideoPage(driver);
		vv.clickOnVideo(driver); 
		
	}
		
	
	@Test(description = "Find Volume Slider", priority = 40)
	public void findVolumeSlider () {
		
		waitSomeSeconds(3);
		WebElement volumeSlider = driver.findElement(By.className("fp-volumeslider"));
	
	}; 
	
	
	@Test(description = "Decrease Volume", priority = 50)
	public void decreaseVolume () {
		
		waitSomeSeconds(3);
		
		ViewVideoPage vv = new ViewVideoPage(driver);
		vv.changeVolume(driver, -30); 
		
	}
	
	
	@Test(description = "Increase Volume", priority = 60)
	public void increaseVolume () {
	
		waitSomeSeconds(5);
		
		ViewVideoPage vv = new ViewVideoPage(driver);
		vv.changeVolume(driver, 30); 
		
	}
	
	
	@Test(description = "Stop Video", priority = 70)
	public void stopVideo () {
			
		waitSomeSeconds(5);
		
		ViewVideoPage vv = new ViewVideoPage(driver);
		vv.clickOnVideo(driver);
				
	}
	
	
	@Test(description = "Close Browser", priority = 80)
	public void closeBrowser () {
	
		waitSomeSeconds(2);
		driver.close(); 
		
	}
	
	
	//функция, делающая паузу в 10 секунд в случае если страница ещё не загрузилась
	public void waitSomeSeconds(int sec) {
		
		try {
			Thread.currentThread().sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
				
	} 

	}
	

	
	
	
	

