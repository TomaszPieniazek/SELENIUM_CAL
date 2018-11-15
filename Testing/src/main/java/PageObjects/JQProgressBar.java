package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class JQProgressBar extends BasePage{

    private final static String url="http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html";
    protected RemoteWebDriver wb;


    public JQProgressBar(RemoteWebDriver wb) {
        super(wb);
    }

    @FindBy(xpath = "//*[@id=\"downloadButton\"]")
    WebElement startDownloadButton;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button")
    WebElement closeButton;

    public WebElement getStartDownloadButton() {
        return startDownloadButton;
    }

    public void setStartDownloadButton(WebElement startDownloadButton) {
        this.startDownloadButton = startDownloadButton;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

    public void setCloseButton(WebElement closeButton) {
        this.closeButton = closeButton;
    }
}
