package utils;

import org.openqa.selenium.By;

public class Locators {

    /********************************************* Home Page *******************************************/

    public static class HomePageLocators {

        /* Sign In */
        public By email = By.id("email");
        public By password = By.id("password");
        public By signInBtn = By.xpath("//button[contains(@class,'btn primary-button')]");
    }

    /********************************************* Main Page *******************************************/
    public static class MainPageLocators {
        public By tradeBtn = By.xpath("(//div[contains(@class,'switcher-item position-relative')])[1]");
        public By tradeChannelBtn = By.xpath("//body/div[@id='root']/div/div/div/div[3]/div[1]/div[2]");

        public By rfqBtn = By.xpath("//div[contains(text(),'RFQ')]");
        public By cfBtn = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div[2]/div");
        public By futureBtn = By.xpath("//div[@class='item'][contains(text(),'Future')]");

        public By accountDropDown = By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[@id='select-account']/div/div[1]");
        public By valueDropDown = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div[2]/div/div");

        public By expiryDropDown = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/div[4]/table/tbody/tr/td[4]/div/div/div/div[1]/div[1]");
        public By perpetualValue = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/div[4]/table/tbody/tr/td[4]/div/div/div[2]/div/div[1]");

        public By quantity = By.xpath("//body//tbody//td[9]");
        public By value = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/div[4]/table/tbody/tr/td[9]/input");

        public By sendRFQBtn = By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show div.modal-dialog.xl.rfq-builder-modal.modal-xl div.modal-content div.px-3.py-3 div.rfq-builder div.d-flex.justify-content-between.mt-3:nth-child(5) > button.btn.primary-button.padding.px-4:nth-child(2)");

        public By quoteBtn = By.xpath("//button[contains(text(),'Quote')]");
        public By markValue = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/span[2]");
        public By subAccount = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div[2]/form/div[1]/div/div/div/div[1]");
        public By subAccountValue = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div[2]/form/div[1]/div/div/div[2]");
        public By price_1 = By.xpath("//body/div/div/div/div/div/div/div/form/div/div/div/input[1]");
        public By price_2 = By.xpath("//body//input[2]");
        public By submitQuote = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div[2]/form/div[2]/div[2]/button");

        public By buyBtn = By.xpath("//button[text()='Buy']");
        public By buyConfirmBtn = By.xpath("(//button[text()='Buy'])[2]");
        public By sellBtn = By.xpath("//button[text()='Sell']");
        public By sellConfirmBtn = By.xpath("(//button[text()='Sell'])[2]");
    }
}


