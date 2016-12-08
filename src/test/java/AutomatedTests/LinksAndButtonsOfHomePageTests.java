package AutomatedTests;

/**
 * Created by caglarfindikli on 07/12/2016.
 */


import Pages.*;
import Utilities.BrowserUtils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.annotations.Test;


public class LinksAndButtonsOfHomePageTests extends CommonPageObjects {

    WebDriver driver;



    @Parameters({ "browser" })
    @BeforeClass
    public void beforeClass(String browser) {

        driver = BrowserUtils.openBrowser(browser);


    }

    @BeforeMethod
    public void beforeMethod() {

        driver.get(HomePage.getBaseUrl());

    }



    @Test(priority = 1)
    public void clickAbout() {

        aboutLink(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(AboutPage.getPageUrl()));

    }



    @Test(priority = 2)
    public void clickJobs() {

        jobsLink(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(getUpdatedUrlAfterClickingLogoOrJobs()));

    }

    @Test(priority = 3)
    public void clickContact() {

        contactLink(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(getUpdatedUrlAfterClickingContact()));

    }

    @Test(priority = 4)
    public void clickJobOpening() {

        HomePage.jobOpeningButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(JobPostingDetailPage.getPageUrl()));


    }

    @Test(priority = 5)
    public void clickCorporateWebsite() {

        corporateWebSite(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(CorporateWebsiteHomePage.getPageUrl()));


    }

    @Test(priority = 6)
    public void clickLogo() {

       logoButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(getUpdatedUrlAfterClickingLogoOrJobs()));

    }


    @Test(priority = 7)
    public void clickLogoAndContact() {

        logoButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        contactLink(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(getUpdatedUrlAfterClickingLogoOrJobs()+getUpdatedUrlSuffix()));

    }


    @AfterClass
    public void afterTest() {
    driver.quit();
    }
}
