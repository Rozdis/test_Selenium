package pages;

import base.PageTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultSearchPage extends PageTools {

    private final By allResults = By.xpath("//section[@id='section-search']/div/div/div[@class='pure-u-xs-1']");


    public List<String> getListOfResults(){
        List<String> results = new ArrayList<>();

        for (WebElement webElement: getElements(allResults)) {
            results.addAll(getResultsAsTitleAndResult(webElement.getText()));
        }
        return results;
    }

    public List<String> getResultsAsTitleAndResult(String results){
        List<String> temp = new ArrayList<>();
        String[] resultsArray = results.split("\n");
        for (int i = 1; i <= resultsArray.length - 1; i++) {
            temp.add(resultsArray[0] + ";" + resultsArray[i]);
        }
        return temp;
    }
}
