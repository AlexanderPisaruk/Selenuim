package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.LoginPage;
import Page.ProfilePage;

public class PatternsTestingExample {
	
	private WebDriver driver = new FirefoxDriver(); 
	
	String oldAPI; 
	String newAPI; 
	
	
	//@BeforeMethod(description = "Open Login page")
	@Test(description = "Open Login page")
	public void OpenLoginPage() throws InterruptedException {
		driver.get(LoginPage.CurrentPageURL);
		
		Assert.assertTrue(driver.getCurrentUrl().equals(LoginPage.CurrentPageURL));
		//pleaseWait(LoginPage.VideoportalURL); 
			
	} 
		
	@Test(description = "LogIn action", priority = 0)
	public void loginAction() throws InterruptedException{
		LoginPage lp = new LoginPage(driver); 
		
		lp.setCredentials("Auto_EPM-TUBE_UploadBroadcast@epam.com", "YFY!cFb2e3AD*cJta@");
		pleaseWait(HomePage.CurrentPageURL);
		Assert.assertTrue(driver.getCurrentUrl().equals(HomePage.CurrentPageURL));
	}
	
	
	@Test(description = "Open Profile page", priority = 1)
	public void openProfileAction() throws InterruptedException{
		HomePage hp = new HomePage(driver); 
		//Assert.assertTrue(driver.getCurrentUrl().equals(hp.CurrentPageURL));
		hp.openProfile(); 
		pleaseWait(ProfilePage.CurrentPageURL);
		Assert.assertTrue(driver.getCurrentUrl().equals(ProfilePage.CurrentPageURL));
		
	}
	
		
	@Test(description = "Get Old API", priority = 2)
	public void getOldAPI() {
		ProfilePage pp = new ProfilePage(driver);
		oldAPI = pp.getApi(driver); 
		
	}
	
	@Test(description = "Regenerate API", priority = 3)
	public void reGenerateAPI() {
		ProfilePage pp = new ProfilePage(driver);
		pp.reGenerateAPI(driver); 
		
	} 
	
	@Test(description = "Get New API", priority = 4)
	public void getNewAPI() {
		ProfilePage pp = new ProfilePage(driver);
		newAPI = pp.getApi(driver); 
		
	}
	
	@Test(description = "Compare old and new API", priority = 5)
	public void compareAPI() {
		Assert.assertNotEquals(newAPI, oldAPI, "ERROR: API hasn't been changed.");
			
	}
	
	@Test(description = "Logout action", priority = 6)
	public void LogOut() {
		
		ProfilePage pp = new ProfilePage(driver);
		pp.LogOut(driver); 
		Assert.assertTrue(driver.getCurrentUrl().equals(LoginPage.CurrentPageURL));
		
	}
	
//	@AfterMethod(description = "Close browser")
	@Test(description = "Close browser", priority = 7)
		public void closeBrowser() {
	driver.close(); 
		
	}	
	
	
	
	public void pleaseWait(String pageURL) throws InterruptedException {
		
		int timeout=10;
		boolean result=false;
		while(timeout>0 && result==false){
			if(driver.getCurrentUrl().equals(pageURL)){
				result = true;
			}
			System.out.println("seconds to wait "+timeout+"for "+driver.getCurrentUrl()+" equals "+pageURL);
			Thread.sleep(1000);
			timeout--;
		}
		
		Assert.assertTrue(driver.getCurrentUrl().equals(pageURL));
		
		
	}; 

	
//	public void checkPageURL(WebDriver driver, AbstractPage page) {		
	//	Assert.assertTrue(driver.getCurrentUrl().equals(page.CurrentPageURL));
		
	//	return this; 
	//}; 
	
	
}
