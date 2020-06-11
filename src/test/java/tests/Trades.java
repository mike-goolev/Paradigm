package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.Screenshot;

public class Trades extends BaseTest {
    private HomePage homePage;
    private MainPage mainPage;

    @BeforeClass(alwaysRun = true)
    public void preconditions() {
        System.out.println("\nExecuting preconditions for " + this.getClass().getName() + "...\n");
    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        homePage = new HomePage(driver);
        mainPage = new MainPage(driver);

    }

    @Test
    public void trading() {

        /* run test twice using for loop */
        for(int i=0; i<2; i++) {
            if (i == 0) {

                /* Start test on home page */
                homePage.loadHomePageByURL();

                /* Login User A */
                homePage.enterEmail("paradigmtrading7@qa.team");
                homePage.enterPassword("Testio1234");
                homePage.clickSignBtn();
            }

            /* Click Trade section and load trade channel with User B */
            mainPage.clickTradeBtn();
            mainPage.clickTradeChannelBtn();

            /* Click RFQ, CF button and Future buttons */
            mainPage.clickRFQBtn();
            mainPage.clickCFBtn();
            mainPage.clickFutureBtn();

            /* Select account */
            mainPage.clickAccountDropDown();
            mainPage.selectValue();

            /* Select Perpetual from ‘Expiry’ dropdown */
            mainPage.clickExpiryDropDown();
            mainPage.selectPerpetualValue();

            /* Enter Quantity amount */
            mainPage.enterQuantity();

            /* Click ‘Send RFQ’ */
            mainPage.clickSendRFQBtn();

            /* Store the current window handle */
            String winHandleBefore = driver.getWindowHandle();

            /* Open new window tab */
            if (i == 0) {
                String url_second = "https://fe.stage.paradigm.co/";
                ((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url_second);
            }

            // Switch to new window opened
            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }

            if (i == 0) {
                /* Login User B */
                homePage.enterEmail("paradigmtrading32@qa.team");
                homePage.enterPassword("Testio1234");
                homePage.clickSignBtn();
            }

            /* Click Trade section and load trade channel with User A */
            mainPage.clickTradeBtn();
            mainPage.clickTradeChannelBtn();

            /* Click Quote button */
            mainPage.clickQuoteBtn();

            /* Select sub account */
            mainPage.clickAccountDropDownOnDetails();
            mainPage.selectsubValue();

            /* Enter price, copy value from Mark price */
            mainPage.enterPrice();

            /* Submit Quote */
            mainPage.clickSubmitQuoteBtn();

            if (i == 0) {
                /* Switch to old window opened */
                driver.switchTo().window(winHandleBefore);

                /* Click Buy button, Click Buy again in confirm dialog */
                mainPage.clickBuyBtn();
                mainPage.clickBuyConfirmBtn();
            }

            /* Click Sell button and confirm */
            if (i == 1) {
                driver.switchTo().window(winHandleBefore);
                mainPage.clickSellBtn();
                mainPage.lickSellConfirmBtn();
            }
        }
    }

    @AfterMethod(alwaysRun = true)
    public void methodTearDown(ITestResult result) {
        if ((!result.isSuccess()) || (result.getStatus() == 3)) {
            Screenshot.takeScreenShot(result.getMethod().getMethodName(), driver);
        }
        Screenshot.takeScreenShot(result.getMethod().getMethodName(), driver);
    }
}
