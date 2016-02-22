package test.java.search.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseSelenium {
    public static WebDriver driver;


    public static void init(){
        System.setProperty("webdriver.chrome.driver", "c:\\tools\\chromedriver.exe");
      //  driver = new FirefoxDriver(); 
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
    }

    public static void close(){
        try {
            driver.quit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            driver = null;
        }
    }
}
