package pages;

import base.PageTools;
import enums.Languages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Constants;

public class Header extends PageTools {

    private final By openSearchFieldSpan = By.xpath("//a[@title='Поиск']/span");
    private final By searchField = By.id("search_term");


    public void openSearchField(){
        waitForElementVisibly(openSearchFieldSpan);
        waitForElementClickable(openSearchFieldSpan);
        click(openSearchFieldSpan);
    }

    public void inputSearchQuery(String query){
        waitForElementVisibly(searchField);
        type(query, searchField);
    }


    public void selectLanguage(Languages language){
        openPageByUrl(Constants.BASE_URL + language.getTitle());
    }

}
