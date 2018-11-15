package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class InputFormSubmitPage extends BasePage {
    private static final String url="http://www.seleniumeasy.com/test/input-form-demo.html";
    private RemoteWebDriver wb;


    public InputFormSubmitPage(RemoteWebDriver wb) {
        super(wb);
    }

    public static String getUrl() {
        return url;
    }

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")
    WebElement phone;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")
    WebElement address;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")
    WebElement state;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")
    WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input")
    WebElement website;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input")
    WebElement hostingYes;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[2]/label/input")
    WebElement hostingNo;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")
    WebElement projectDesc;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")
    WebElement sendButton;

    public WebElement getFirstName() {
        return firstName;
    }

    public void setFirstName(WebElement firstName) {
        this.firstName = firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public void setLastName(WebElement lastName) {
        this.lastName = lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement getPhone() {
        return phone;
    }

    public void setPhone(WebElement phone) {
        this.phone = phone;
    }

    public WebElement getAddress() {
        return address;
    }

    public void setAddress(WebElement address) {
        this.address = address;
    }

    public WebElement getCity() {
        return city;
    }

    public void setCity(WebElement city) {
        this.city = city;
    }

    public WebElement getState() {
        return state;
    }

    public void setState(WebElement state) {
        this.state = state;
    }

    public WebElement getZipCode() {
        return zipCode;
    }

    public void setZipCode(WebElement zipCode) {
        this.zipCode = zipCode;
    }

    public WebElement getWebsite() {
        return website;
    }

    public void setWebsite(WebElement website) {
        this.website = website;
    }

    public WebElement getHostingYes() {
        return hostingYes;
    }

    public void setHostingYes(WebElement hostingYes) {
        this.hostingYes = hostingYes;
    }

    public WebElement getHostingNo() {
        return hostingNo;
    }

    public void setHostingNo(WebElement hostingNo) {
        this.hostingNo = hostingNo;
    }

    public WebElement getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(WebElement projectDesc) {
        this.projectDesc = projectDesc;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    public void setSendButton(WebElement sendButton) {
        this.sendButton = sendButton;
    }
}
