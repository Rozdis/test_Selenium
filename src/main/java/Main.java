import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();
    webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    webDriver.navigate().to("https://www.google.com/");
    //webDriver.manage().window().maximize();

    webDriver.findElement(By.name("q")).sendKeys("java");
        webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    webDriver.close();

    }
}
