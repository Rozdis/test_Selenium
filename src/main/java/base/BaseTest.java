package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Constants;

public class BaseTest extends PageTools{

    @BeforeTest
    public void openPage(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.navigate().to(Constants.BASE_URL);
        webDriver.manage().window().setSize(new Dimension(1920, 1080));
    }

    @AfterTest
    public void terminateBrowser(){
        webDriver.close();
    }
}
