package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserDriver {
    public static WebDriver driver;


    public BrowserDriver(){

        this.driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
    }
    public void close(){
        this.driver.close();
    }
}