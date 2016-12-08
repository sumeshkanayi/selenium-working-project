package Pages;

/**
 * Created by caglarfindikli on 07/12/2016.
 */
public class AboutPage extends CommonPageObjects {

    private static String pageUrlSuffix;

    public static String getPageUrl(){

        pageUrlSuffix = "about.html";

        return getBaseUrl()+ pageUrlSuffix;

    }
}
