package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class MainPage extends BasePage {
    private final Locators.MainPageLocators mainPageLocators;

    public MainPage(WebDriver driver) {
        super(driver);
        mainPageLocators = new Locators.MainPageLocators();
    }

    public void clickTradeBtn() {
        click(mainPageLocators.tradeBtn);
    }

    public void clickTradeChannelBtn() {
        click(mainPageLocators.tradeChannelBtn);
    }

    public void clickRFQBtn() {
        click(mainPageLocators.rfqBtn);
    }

    public void clickCFBtn() {
        click(mainPageLocators.cfBtn);
    }

    public void clickFutureBtn() {
        click(mainPageLocators.futureBtn);
    }

    public void clickAccountDropDown() {
        click(mainPageLocators.accountDropDown);
    }

    public void selectValue() {
        click(mainPageLocators.valueDropDown);
    }

    public void clickExpiryDropDown() {
        click(mainPageLocators.expiryDropDown);
    }

    public void selectPerpetualValue() {
        click(mainPageLocators.perpetualValue);
    }

    public void enterQuantity() {
        click(mainPageLocators.quantity);
        driver.findElement(mainPageLocators.value).sendKeys("200000");

    }

    public void clickSendRFQBtn() {
        click(mainPageLocators.sendRFQBtn);
    }

    public void clickQuoteBtn() {
        click(mainPageLocators.quoteBtn);
    }

    public void clickAccountDropDownOnDetails() {
        click(mainPageLocators.subAccount);
    }

    public void selectsubValue() {
        click(mainPageLocators.subAccountValue);
    }

    public void enterPrice() {
        /* Get mark value */
        String markValue = driver.findElement(mainPageLocators.markValue).getText();


        /* Remove ',' from mark value */
        markValue = markValue.replace(",", "");

        /* Enter prices */
        driver.findElement(mainPageLocators.price_1).sendKeys(markValue);
        driver.findElement(mainPageLocators.price_2).sendKeys(markValue);
    }

    public void clickSubmitQuoteBtn() {
        click(mainPageLocators.submitQuote);
    }

    public void clickBuyBtn() {
        click(mainPageLocators.buyBtn);
    }

    public void clickBuyConfirmBtn() {
        click(mainPageLocators.buyConfirmBtn);
    }

    public void clickSellBtn() {
        click(mainPageLocators.sellBtn);
    }

    public void lickSellConfirmBtn() {
        click(mainPageLocators.sellConfirmBtn);
    }
}
