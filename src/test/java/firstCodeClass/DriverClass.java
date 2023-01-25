package firstCodeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
    private WebDriver driver;
    private String browserName = "chrome";
    private String url = "https://demoqa.com/buttons";


    public void initDriver(){

        System.out.println("Init!");
        System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    public WebDriver getDriver () {
        return driver;
    }

    public void quitBrowser() {
        driver.quit();
    }
}
