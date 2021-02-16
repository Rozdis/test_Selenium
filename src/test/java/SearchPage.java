import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchPage {
    By fieldSearch = By.name("q");

    private final WebDriver webDriver;

    public SearchPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public SearchPage submitSearch(){
        webDriver.findElement(fieldSearch).sendKeys(Keys.ENTER);
        return new SearchPage(webDriver);
    }

    public SearchPage typeQuery(String query){
        webDriver.findElement(fieldSearch).sendKeys(query);
        return this;
    }

    public void checkPage(String expectedTitle){
        String actualTitle = webDriver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
