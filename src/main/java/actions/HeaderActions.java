package actions;

import base.PageTools;
import enums.Languages;
import pages.Pages;


public class HeaderActions {
    public void executeSearchQuery(String query) {
        Pages.header().openSearchField();
        Pages.header().inputSearchQuery(query);
        PageTools.clickEnter();
    }

    public void chooseLanguage(Languages language){
        Pages.header().selectLanguage(language);
    }
}
