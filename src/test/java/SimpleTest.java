import actions.Actions;
import base.BaseTest;
import enums.Languages;
import org.junit.Test;
import pages.Pages;
import utils.CSVUtils;
import org.assertj.core.api.Assertions;


import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;


public class SimpleTest extends BaseTest {

    @Test
    public void test() throws InterruptedException, IOException {
        //change language to EN
        Actions.headerActions().chooseLanguage(Languages.EN);
        //execute search query "DEVELOPER"
        Actions.headerActions().executeSearchQuery("DEVELOPER");
        //wait for loading page
        TimeUnit.SECONDS.sleep(1);
        //save results to csv file
        CSVUtils.writeToCsvFile("result", Pages.resultSearchPage().getListOfResults());
        //get date from reference file
        HashSet<String> testFileData = new HashSet<>(CSVUtils.getListOfDataFromCsvFile("test_EN"));
        //get date from result file
        HashSet<String> resultFileData = new HashSet<>(CSVUtils.getListOfDataFromCsvFile("result"));
        //remove from result file date of reference file
        resultFileData.removeAll(testFileData);
        //comparing expected result with actual
        Assertions.assertThat(resultFileData.size())
                .as("In test_EN file does not match next results: \n" + resultFileData)
                .isEqualTo(0);
    }


}
