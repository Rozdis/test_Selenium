package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class PageTools {
    protected static WebDriver webDriver;

    public static void click(By by){
        webDriver.findElement(by).click();
    }

    public static void waitForElementVisibly(By by){
        WebElement myDynamicElement = (new WebDriverWait(webDriver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitForElementClickable(By by){
        WebElement myDynamicElement = (new WebDriverWait(webDriver, 10))
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void type(String string, By by){
        webDriver.findElement(by).sendKeys(string);
    }

    public static List<WebElement> getElements(By by){
        return webDriver.findElements(by);
    }

    public static String getElementText(By by){
        return webDriver.findElement(by).getText();
    }

    public static void clickEnter() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void openPageByUrl(String url){
        webDriver.navigate().to(url);
    }
}
