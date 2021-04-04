import actions.Actions;
import base.BaseTest;
import enums.Languages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.Pages;


import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;


public class TestNGSimpleTest extends BaseTest {


    @Test
    public void test() throws InterruptedException, IOException {
        Actions.headerActions().chooseLanguage(Languages.EN);
        Actions.headerActions().executeSearchQuery("DEVELOPER");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(Pages.resultSearchPage().getListOfResults());
        HashSet<String> testFile = new HashSet<String>(FileUtils.readLines(new File("test.csv")));
        HashSet<String> resultFile = new HashSet<String>(FileUtils.readLines(new File("results.csv")));
        resultFile.removeAll(testFile); // f1 now contains only the lines which are not in f2
        TimeUnit.SECONDS.sleep(5);
    }


}
