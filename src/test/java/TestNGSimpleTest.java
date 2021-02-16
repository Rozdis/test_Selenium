import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {
    public WebDriver webDriver;



    @BeforeTest
    public void openPage(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.navigate().to("https://www.google.com/");
    }

    @Test
    public void test(){
        SearchPage searchPage = new SearchPage(webDriver);
        searchPage.typeQuery("java");
        searchPage.submitSearch();
        String expectedTitle = "java - Пошук Google";
        searchPage.checkPage(expectedTitle);

        System.out.println(webDriver.getTitle());
    }

    @AfterTest
    public void terminateBrowser(){
        webDriver.close();
    }
}
