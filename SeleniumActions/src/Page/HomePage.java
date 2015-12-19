package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends AbstractPage {

	public static final String CurrentPageURL = "https://videoportalqa.epam.com/";
	
	@FindBy(className="profile-photo")
	private WebElement userMenu; 
	
	@FindBy(xpath="//a[contains(@href, '/profile')]")
	private WebElement profileOption; 
	
	@FindBy(xpath="//a[contains(@href, '/my-videos')]")
	private WebElement myContentOption; 
	

		
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public HomePage openProfile(){
		
		userMenu.click(); 
		profileOption.click(); 		
		
		return this; 
		
	}
	
	
public HomePage openMyContent(){
		
		userMenu.click(); 
		myContentOption.click(); 		
		
		return this; 
		
	}
	
	
	
	

}
