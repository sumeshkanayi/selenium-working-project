package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by caglarfindikli on 07/12/2016.
 */
public class JobPostingDetailPage extends CommonPageObjects {


     static String pageUrl;



    public static String getPageUrl(){

        pageUrl = getBaseUrl()+"front-end-web-developer.html";

        return pageUrl;

    }


    public static WebElement backToAllOffersButton(WebDriver driver){

        element = driver.findElement(By.partialLinkText("Back to all offers"));

        return element;

    }


}
