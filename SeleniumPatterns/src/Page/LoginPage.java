package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends AbstractPage {

	public static final String CurrentPageURL = "https://videoportalqa.epam.com/login"; 
	
	@FindBy(id="username")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(className="login-submit-btn")
	private WebElement loginButton;
		
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
		
		// TODO Auto-generated constructor stub
	}
	
/*	public boolean waitForElement(WebElement element) throws InterruptedException{
		int timeout = 30;
		while(!element.isDisplayed() && timeout>0){
			
			Thread.sleep(1000);
			timeout--;
		}
		return element.isDisplayed();
	} */
	
	public LoginPage setCredentials(String Login, String Password) throws InterruptedException{
		
		
		
		
		System.out.println(Login+" "+Password);
		System.out.println(" "+usernameField.isDisplayed());
		
		//waitForElement(usernameField);
		
		usernameField.sendKeys(Login);

		passwordField.sendKeys(Password);
					
		loginButton.click();  
		
		return this; 
		
	}
	
	
	

}
