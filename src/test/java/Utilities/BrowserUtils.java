package Utilities;

/**
 * Created by caglarfindikli on 07/12/2016.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;


    public class BrowserUtils {

        public static WebDriver openBrowser(String nameOfBrowser)
        {
            WebDriver driver;
            if(nameOfBrowser.equalsIgnoreCase("Firefox"))
            {
                System.setProperty("webdriver.gecko.driver", "/Users/caglarfindikli/Test/geckodriver");
                driver = new FirefoxDriver();
            }
            else if (nameOfBrowser.equalsIgnoreCase("Chrome"))
            {


                System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

                driver = new ChromeDriver();
                driver.manage().window().maximize();


            }
            else if (nameOfBrowser.equalsIgnoreCase("Safari"))
            {


                System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
                driver = new SafariDriver();
                driver.manage().window().maximize();
                System.out.println(nameOfBrowser + " launching Safari as choice");
            }


            else

            {

                System.setProperty("webdriver.gecko.driver", "/Users/caglarfindikli/Test/geckodriver");
                driver = new FirefoxDriver();
                System.out.println(nameOfBrowser + " is invalid, launching Firefox as default browser");

            }
            return driver;

        }


        public static  void  waitForLoad(WebDriver driver) {
            ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                }
            };
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(pageLoadCondition);

        }



    }





