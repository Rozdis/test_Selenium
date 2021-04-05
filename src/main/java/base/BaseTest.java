package base;

import org.junit.After;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constants;
import org.junit.Before;

public class BaseTest extends PageTools{

    @Before
    public void openPage(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.navigate().to(Constants.BASE_URL);
        webDriver.manage().window().setSize(new Dimension(1920, 1080));
    }

    @After
    public void terminateBrowser(){
        webDriver.close();
    }
}
