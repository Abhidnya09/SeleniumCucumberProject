package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class HomePage {
    public static String hamburger_icon_xpath="//*[@id=\"menuToggle\"]/input";
    public static String sign_in_link_xpath="//*[@id=\"menu\"]/a[2]";

    public static void hamburger_click() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_icon_xpath)).click();
    }

    public static void signin_click() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_in_link_xpath)).click();
    }

}
