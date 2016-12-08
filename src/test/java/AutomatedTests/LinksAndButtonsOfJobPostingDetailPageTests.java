package AutomatedTests;

import Pages.*;
import Utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by caglarfindikli on 08/12/2016.
 */
public class LinksAndButtonsOfJobPostingDetailPageTests extends CommonPageObjects {
    WebDriver driver;



    @Parameters({ "browser" })
    @BeforeClass
    public void beforeClass(String browser) {

        driver = BrowserUtils.openBrowser(browser);


    }

    @BeforeMethod
    public void beforeMethod() {

        driver.get(getBaseUrl());

    }


    @Test(priority = 1)
    public void clickLogoButton() {


        HomePage.jobOpeningButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        logoButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(getUpdatedUrlAfterClickingLogoOrJobs()));

    }


    @Test(priority = 2)
    public void clickAbout() {


        HomePage.jobOpeningButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        aboutLink(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(AboutPage.getPageUrl()));

    }

    @Test(priority = 3)
    public void clickJobs() {


        HomePage.jobOpeningButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        jobsLink(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(getUpdatedUrlAfterClickingLogoOrJobs()));

    }

    @Test(priority = 4)
    public void clickContact() {


        HomePage.jobOpeningButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        contactLink(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(JobPostingDetailPage.getPageUrl()+getUpdatedUrlSuffix()));

    }

    @Test(priority = 5)
    public void clickCorporateWebsite() {

        HomePage.jobOpeningButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        corporateWebSite(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(CorporateWebsiteHomePage.getPageUrl()));


    }

    @Test(priority = 6)
    public void clickBackToAllOffers() {

        HomePage.jobOpeningButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        JobPostingDetailPage.backToAllOffersButton(driver).click();
        BrowserUtils.waitForLoad(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains(getUpdatedUrlAfterClickingLogoOrJobs()));


    }


    @AfterClass
    public void afterTest() {
        driver.quit();
    }







}
