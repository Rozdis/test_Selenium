package pages;

import base.PageTools;

public class Pages {
    private static Header header;
    private static ResultSearchPage resultSearchPage;

    public static Header header(){
        if (header == null){
            header = new Header();
        }
        return header;
    }

    public static ResultSearchPage resultSearchPage(){
        if (resultSearchPage == null){
            resultSearchPage = new ResultSearchPage();
        }
        return resultSearchPage;
    }

}
