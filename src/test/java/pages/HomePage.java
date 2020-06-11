package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;
import utils.TestConfig;

public class HomePage extends BasePage {
    private final Locators.HomePageLocators homePageLocators;

    public HomePage(WebDriver driver) {
        super(driver);
        homePageLocators = new Locators.HomePageLocators();
    }

    /**
     * Navigates to the home page via URL
     */
    public void loadHomePageByURL() {
        String currentUrl = driver.getCurrentUrl();
        String toUrl = TestConfig.getBaseUrl();

        if (!currentUrl.equals(toUrl)) {
            driver.get(toUrl);
        }
    }

    public void enterEmail(String email) {
        setElementText(homePageLocators.email, email);
    }

    public void enterPassword(String password) {
        setElementText(homePageLocators.password, password);
    }

    public void clickSignBtn() {
        click(homePageLocators.signInBtn);
    }
}
