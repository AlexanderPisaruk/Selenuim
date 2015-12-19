package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

		protected String PageTitle; 
		
		protected WebDriver driver; 
		
		public AbstractPage(WebDriver driver) {
			
			this.driver = driver; 

					
			
		}	
		
		
		
	
	
	
	
}
