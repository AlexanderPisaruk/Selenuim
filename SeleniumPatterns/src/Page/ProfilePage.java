package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends AbstractPage {
	
	public static final String CurrentPageURL = "https://videoportalqa.epam.com/profile";

	@FindBy(xpath = "//input[contains(@type, 'text')]")
	private WebElement apiKeyField; 
	
	@FindBy(xpath = "//button[contains(@title, 'Re-Generate')]")
	private WebElement reGenarateButton; 
	
	@FindBy(className="profile-photo")
	private WebElement userMenu; 
	
	@FindBy(xpath = "//a[contains(@href, '/logout')]")
	private WebElement logOutOption; 
	

	public ProfilePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
		// TODO Auto-generated constructor stub
	}

	
	public String getApi(WebDriver driver) {
		
		String API = apiKeyField.getAttribute("value"); 
		return API; 
				//this; 
		
	}
	
	
	public ProfilePage reGenerateAPI(WebDriver driver) {
		
		reGenarateButton.click(); 
		return this; 
	}
	
	
	public ProfilePage LogOut(WebDriver driver) {
		
		userMenu.click(); 
		logOutOption.click(); 
		return this;
		
	}
	
		
}
