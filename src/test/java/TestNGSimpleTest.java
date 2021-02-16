import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {
    public WebDriver webDriver;

    @BeforeTest
    public void openPage(){
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.navigate().to("https://www.google.com/");
    }

    @Test
    public void test(){
        String expectedTitle = "java - Пошук Google";

        webDriver.findElement(By.name("q")).sendKeys("java");
        webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        String actualTitle = webDriver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println(webDriver.getTitle());
    }

    @AfterTest
    public void terminateBrowser(){
        webDriver.close();
    }
}
