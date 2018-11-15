package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class TableSearchFilterPage extends BasePage{

    private static final String url="http://www.seleniumeasy.com/test/table-search-filter-demo.html";
    protected RemoteWebDriver wb;


    public TableSearchFilterPage(RemoteWebDriver wb) {
        super(wb);
    }

    public static String getUrl() {
        return url;
    }

    @FindBy(xpath = "//*[@id=\"user-message\"]")
    WebElement inputMessage;

    @FindBy(xpath = "//*[@id=\"get-input\"]/button")
    WebElement showMessageButton;

    @FindBy(xpath = "//div[@id='user-message']//span[@id='display']")
    WebElement spanMessage;

    @FindBy(xpath = "//*[@id=\"task-table-filter\"]")
    WebElement filterInput;

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

    public WebElement getFilterInput() {
        return filterInput;
    }

    public void setFilterInput(WebElement filterInput) {
        this.filterInput = filterInput;
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
