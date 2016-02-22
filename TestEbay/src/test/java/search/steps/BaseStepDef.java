package test.java.search.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.java.search.selenium.BaseSelenium;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class BaseStepDef extends BaseSelenium {

    WebDriver driver = new FirefoxDriver(); 
    String deviceName; 
    
    @Given("^I set search request \"([^\"]*)\"$")
    public void iSetSearchRequest(String searchRequest) throws NullPointerException {

    	driver.get("http://ebay.com");
        driver.findElement(By.xpath(".//*[@id='gh-ac']")).sendKeys(searchRequest);
        
      //  throws new NullPointerException(); 
        
          } 
    
    @When("^I perfom search$")
    public void iPerfomSearch() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='gh-btn']")).click();
           
        //driver.findElement(By.xpath(".//*[@id='ListViewInner']/li[1]")).click();  
        
      
    }

    @Then("^the term query \"([^\"]*)\" should be the first in the Search Result grid$")
    public void theTermQueryShouldBeTheFirstInTheSearchResultGrid(String expectPhrase) throws Throwable {
        String firstSnippet = driver.findElement(By.xpath(".//*[@id='ListViewInner']/li[1]")).getText();
        
        deviceName = firstSnippet; 
        
        assertThat(firstSnippet,containsString(expectPhrase));
       
    /*    
        driver.get("http://www.ebay.com/itm/Apple-iPhone-4S-16GB-Factory-Unlocked-Smartphone-Black-White-Perfect-Condition-/221978178445?var=&hash=item33aeee338d:m:mCGD8IpRtkiKEbNlBonQc5w"); 
       // driver.findElement(By.xpath(".//*[@id='ListViewInner']/li[1]")).click();
       //driver.findElement(By.xpath(".//*[@id='ListViewInner']/li[1]")).click();
        
        driver.findElement(By.id("msku-sel-1")).click();
      
        driver.findElement(By.id("msku-opt-0")).click();
     
        driver.findElement(By.id("isCartBtn_btn")).click();
        driver.findElement(By.id("isCartBtn_btn")).click();
        
        driver.findElement(By.id("gh-cart-i")).click();
        
        String deviceInCart = driver.findElement(By.id("221978178445_title")).getText();
        assertThat(firstSnippet,containsString(expectPhrase));
        */
        
            }
    
    
    @Given("^I have device \"([^\"]*)\"$")
    public void iHaveiphone() throws Throwable {
    	 driver.get("http://www.ebay.com/itm/Apple-iPhone-4S-16GB-Factory-Unlocked-Smartphone-Black-White-Perfect-Condition-/221978178445?var=&hash=item33aeee338d:m:mCGD8IpRtkiKEbNlBonQc5w"); 
         
    	
    }
    
    @When("^I add it in cart$")
    public void iClickOnIt() throws Throwable {

    	// driver.get("http://www.ebay.com/itm/Apple-iPhone-4S-16GB-Factory-Unlocked-Smartphone-Black-White-Perfect-Condition-/221978178445?var=&hash=item33aeee338d:m:mCGD8IpRtkiKEbNlBonQc5w"); 
        
    	 driver.findElement(By.id("msku-sel-1")).click();
        
         driver.findElement(By.id("msku-opt-0")).click();
       
         driver.findElement(By.id("isCartBtn_btn")).click();
         driver.findElement(By.id("isCartBtn_btn")).click();
    	
    
        
          } 
    
    
    @Then("^Device is in cart$")
    public void isInCart(String expectPhrase) throws Throwable {
    
    	 driver.findElement(By.id("gh-cart-i")).click();
         
         String deviceInCart = driver.findElement(By.id("221978178445_title")).getText();
         assertThat(deviceInCart,containsString(deviceName));
    	    
}

}