package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by caglarfindikli on 08/12/2016.
 */
public class CommonPageObjects {


    static WebElement element = null;

    private static String pageUrl;

    private static String updatedUrlSuffix;




    public static WebElement aboutLink(WebDriver driver){

        element = driver.findElement(By.partialLinkText("Firmast"));

        return element;

    }

    public static WebElement jobsLink(WebDriver driver){

        element = driver.findElement(By.partialLinkText("Tööpakkumised"));

        return element;

    }



    public static WebElement contactLink(WebDriver driver){

        element = driver.findElement(By.partialLinkText("Kontakt"));

        return element;

    }



    public static WebElement corporateWebSite (WebDriver driver){

        element = driver.findElement(By.partialLinkText("arvato veebis"));

        return element;

    }



    public static WebElement logoButton (WebDriver driver){

        element = driver.findElement(By.className("logo"));

        return element;
    }







    public static String getBaseUrl(){

        pageUrl = "http://arvato.ee/";

        return pageUrl;

    }


    public static String getUpdatedUrlAfterClickingContact(){

        updatedUrlSuffix = "#contact";

        return getBaseUrl() + updatedUrlSuffix;

    }

    public static String getUpdatedUrlSuffix(){

        updatedUrlSuffix = "#contact";

        return updatedUrlSuffix;

    }

    public static String getRedirectUrl(){

        updatedUrlSuffix = "index.html";

        return updatedUrlSuffix;

    }

    public static String getUpdatedUrlAfterClickingLogoOrJobs(){

        updatedUrlSuffix = "index.html";

        return getBaseUrl() + updatedUrlSuffix;

    }

}