package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasePage {

    private RemoteWebDriver rwd;

    public BasePage(RemoteWebDriver rwd) {
        this.rwd = rwd;
    }

    public void clickOnElement(WebElement we) throws InterruptedException {
        Thread.sleep(1500);
        we.click();
    }

    public boolean isElementPresent(WebElement we){
        boolean result = false;
        if(we!=null){
            result= true;
        }

        return result;
    }

    public RemoteWebDriver getRwd() {
        return rwd;
    }

    public void setRwd(RemoteWebDriver rwd) {
        this.rwd = rwd;
    }

    public BasePage openViaUrl(String url){
        rwd.get(url);
        return this;
    }
}
