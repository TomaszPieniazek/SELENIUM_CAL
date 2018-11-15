package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends BasePage {

    private RemoteWebDriver wb;
    private static final String urlT= "http://www.seleniumeasy.com/test/basic-checkbox-demo.html";

    public CheckboxPage(RemoteWebDriver rwd) {
        super(rwd);
    }

    @FindBy(xpath = "//*[@id=\"isAgeSelected\"]")
    WebElement clickMeCheckbox;

    @FindBy(xpath = "//*[@id=\"txtAge\"]")
    WebElement message;

    public WebElement getClickMeCheckbox() {
        return clickMeCheckbox;
    }

    public void setClickMeCheckbox(WebElement clickMeCheckbox) {
        this.clickMeCheckbox = clickMeCheckbox;
    }

    public WebElement getMessage() {
        return message;
    }

    public void setMessage(WebElement message) {
        this.message = message;
    }

    public static String getUrlT() {
        return urlT;
    }
}
