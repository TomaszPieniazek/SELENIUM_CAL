package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class SimpleFormDemoPage extends  BasePage{
    private static final String url="http://www.seleniumeasy.com/test/basic-first-form-demo.html";
    protected RemoteWebDriver wb;


    public SimpleFormDemoPage(RemoteWebDriver wb) {
        super(wb);
    }

    @FindBy(xpath = "//*[@id=\"user-message\"]")
    WebElement inputMessage;

    @FindBy(xpath = "//*[@id=\"get-input\"]/button")
    WebElement showMessageButton;

    @FindBy(xpath = "//div[@id='user-message']//span[@id='display']")
    WebElement spanMessage;

    @FindBy(xpath = "//*[@id=\"sum1\"]")
    WebElement enterA;

    @FindBy(xpath = "//*[@id=\"sum2\"]")
    WebElement enterB;

    @FindBy(xpath = "//*[@id=\"gettotal\"]/button")
    WebElement totalButton;

    @FindBy(xpath = "//label[contains(text(),'a + b')]/..//span\n")
    WebElement showResult;

    public WebElement getInputMessage() {
        return inputMessage;
    }

    public void setInputMessage(WebElement inputMessage) {
        this.inputMessage = inputMessage;
    }

    public WebElement getShowMessageButton() {
        return showMessageButton;
    }

    public void setShowMessageButton(WebElement showMessageButton) {
        this.showMessageButton = showMessageButton;
    }

    public WebElement getSpanMessage() {
        return spanMessage;
    }

    public void setSpanMessage(WebElement spanMessage) {
        this.spanMessage = spanMessage;
    }

    public WebElement getEnterA() {
        return enterA;
    }

    public void setEnterA(WebElement enterA) {
        this.enterA = enterA;
    }

    public WebElement getEnterB() {
        return enterB;
    }

    public void setEnterB(WebElement enterB) {
        this.enterB = enterB;
    }

    public WebElement getTotalButton() {
        return totalButton;
    }

    public void setTotalButton(WebElement totalButton) {
        this.totalButton = totalButton;
    }

    public WebElement getShowResult() {
        return showResult;
    }

    public void setShowResult(WebElement showResult) {
        this.showResult = showResult;
    }
}
