package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewVideoPage extends AbstractPage {

	
	@FindBy(className="fp-player")
	private WebElement flowPlayer; 
	
	
	@FindBy(className="fp-volumeslider")
	private WebElement volumeSlider; 
	
	
	public ViewVideoPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
		// TODO Auto-generated constructor stub
	} 
	
	
	public ViewVideoPage clickOnVideo(WebDriver driver) {
		flowPlayer.click(); 				
		return this; 
		}
	
	
	public ViewVideoPage changeVolume(WebDriver driver, int x)
	{
		new Actions(driver).dragAndDropBy(volumeSlider, x, 0).build().perform(); 
		return this;
		
	}
	

}
