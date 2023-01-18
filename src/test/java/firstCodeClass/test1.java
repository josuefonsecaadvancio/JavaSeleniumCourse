package firstCodeClass;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe"  );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WaitTests waitTests = new WaitTests(driver);
        waitTests.testWaitImplicit(7);
        waitTests.testWaitExplicit(30);
        waitTests.testFluentWait(30,10000);
        driver.quit();



        //Use the code below, to match the expected text of the first item in the shop
        //Assert.assertEquals();




    }
}
