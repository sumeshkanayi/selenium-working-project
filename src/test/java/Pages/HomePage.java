package Pages;

/**
 * Created by caglarfindikli on 07/12/2016.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class HomePage extends CommonPageObjects{

    private static WebElement element = null;


    public static WebElement jobOpeningButton (WebDriver driver){

        element = driver.findElement(By.partialLinkText("Front-End Web Developer"));

        return element;

    }




}
