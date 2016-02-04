package Base;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static List<String> main() {
		
		WebDriver myBrowser = new FirefoxDriver();
		
		//залогиниться под аплодером-бродкастером
		LoginAction(myBrowser, "Auto_EPM-TUBE_UploadBroadcast@epam.com", "YFY!cFb2e3AD*cJta@"); 
		
		//открыть юзер-меню
		OpenUserMenu(myBrowser);
		
		//кликнуть по опции Profile
		WebElement profile = myBrowser.findElement(By.xpath("//a[contains(@href, '/profile')]"));
		profile.click();
		
		
		//взять старый API
		String oldAPI = GetApiKey(myBrowser); 
		System.out.println("Old API key is: " + oldAPI);
	
		
		//апдейтнуть API
		RegenerateApiKey(myBrowser); 
		String newAPI = GetApiKey(myBrowser); 
		System.out.println("New API key is: " + newAPI);
		
		//вылогиниться
		OpenUserMenu(myBrowser);
		WebElement logout = myBrowser.findElement(By.xpath("//a[contains(@href, '/logout')]"));
		logout.click();
		
		myBrowser.close(); 
		
		List<String> list = new ArrayList<String>(); 
		list.add(oldAPI); 
		list.add(newAPI); 
		
		return list; 
		
	//	System.out.println(list.get(0));
	//	System.out.println(list.get(1));
		
	};

	
//функция, помогающая залогиниться		
public static void LoginAction(WebDriver driver, String login, String password) {
	

	driver.get("https://videoportalqa.epam.com");
		
	WebElement inputLogin = driver.findElement(By.id("username")); 
	inputLogin.sendKeys(login);
		
	WebElement inputPassword = driver.findElement(By.id("password"));
	inputPassword.sendKeys(password);
	
	WebElement loginButton = driver.findElement(By.className("login-submit-btn"));
	loginButton.submit(); 	
		
}; 
	

//функция открывающая юзер-меню
public static void OpenUserMenu(WebDriver driver) {
	
	WebElement userMenu = driver.findElement(By.className("profile-photo"));
	userMenu.click();
	
	
}


//функция для считывания API-ключа из филда на странице Profile
public static String GetApiKey(WebDriver driver) {
	
	WebElement apiField = driver.findElement(By.xpath("//input[contains(@type, 'text')]"));
	String APIKey = apiField.getAttribute("value");
	return APIKey; 
	
}

//функция, обновляющая API-ключ
public static void RegenerateApiKey(WebDriver driver) {
	
	WebElement reGenerate = driver.findElement(By.xpath("//button[contains(@title, 'Re-Generate')]"));
	reGenerate.click();
	
}



	}; 
	
	/*
	try {
		Thread.currentThread().sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} */
	