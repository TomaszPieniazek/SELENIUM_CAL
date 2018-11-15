package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class AjaxFormSubmitPage extends BasePage {

    private static final String url="http://www.seleniumeasy.com/test/ajax-form-submit-demo.html";
    private RemoteWebDriver wb;


    public AjaxFormSubmitPage(RemoteWebDriver wb) {
        super(wb);
    }


    @FindBy(xpath = "//*[@id=\"title\"]")
    WebElement nameInput;

    public static String getUrl() {
        return url;
    }

    @FindBy(xpath = "//*[@id=\"description\"]")
    WebElement commentInput;

    @FindBy(xpath = "//*[@id=\"btn-submit\"]")
    WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"submit-control\"]")
    WebElement result;

    public WebElement getNameInput() {
        return nameInput;
    }

    public void setNameInput(WebElement nameInput) {
        this.nameInput = nameInput;
    }

    public WebElement getCommentInput() {
        return commentInput;
    }

    public void setCommentInput(WebElement commentInput) {
        this.commentInput = commentInput;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(WebElement submitButton) {
        this.submitButton = submitButton;
    }

    public WebElement getResult() {
        return result;
    }

    public void setResult(WebElement result) {
        this.result = result;
    }
}
