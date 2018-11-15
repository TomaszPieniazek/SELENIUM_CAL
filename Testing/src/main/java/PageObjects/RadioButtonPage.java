package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RadioButtonPage extends  BasePage {
    private static final String url="http://www.seleniumeasy.com/test/basic-radiobutton-demo.html";
    protected RemoteWebDriver wb;


    public RadioButtonPage(RemoteWebDriver wb) {
        super(wb);
    }

    public static String getUrl() {
        return url;
    }

    //test elements for Radio Button Demo
    private WebElement maleRadioButtonT1;
    private WebElement femaleRadioButtonT1;
    private WebElement buttonCheckT1;
    private WebElement messageAfterClickedT1;

    //test elements for Radio Buttons Demo
    private WebElement maleRadioButtonT2;
    private WebElement femaleRadioButtonT2;
    private WebElement buttonCheckT2;
    private WebElement messageAfterClickedT2;
    private WebElement radioZeroToFive;
    private WebElement radioFiveToFifteen;
    private WebElement radioFifteenToFifty;

    //Methods for Radio Button Demo
    public RadioButtonPage femaleCheckBoxClickT1(){
        femaleRadioButtonT1.click();
        return this;
    }

    public RadioButtonPage maleCheckBoxClickT1(){
        this.maleRadioButtonT1.click();
        return this;
    }

    public RadioButtonPage buttonCheckClickT1() throws InterruptedException {
        buttonCheckT1.click();
        return this;
    }

    public WebElement getMessageAfterClickedT1() {
        return messageAfterClickedT1;
    }

    //Methods for Radio Buttons Check

    public RadioButtonPage femaleCheckBoxClickT2(){
        femaleRadioButtonT2.click();
        return this;
    }

    public RadioButtonPage maleCheckBoxClickT2(){
        maleRadioButtonT2.click();
        return this;
    }

    public RadioButtonPage radioZeroToFiveClick(){
        radioZeroToFive.click();
        return this;
    }

    public RadioButtonPage radioFiveToFifteenClick(){
        radioFiveToFifteen.click();
        return this;
    }

    public RadioButtonPage radioFifteenToFiftyClick(){
        radioFifteenToFifty.click();
        return this;
    }

    public RadioButtonPage buttonCheckClickT2() throws InterruptedException {
        buttonCheckT2.click();
        return this;
    }

    public WebElement getMessageAfterClickedT2() {
        return messageAfterClickedT2;
    }


    /**Initialization of Page :
     * http://www.seleniumeasy.com/test/basic-radiobutton-demo.html
     */
    public RadioButtonPage initElements(RemoteWebDriver wb){
        maleRadioButtonT1=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input"));
        femaleRadioButtonT1=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input"));
        buttonCheckT1=wb.findElement(By.id("buttoncheck"));
        messageAfterClickedT1=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]"));
        maleRadioButtonT2=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input"));
        femaleRadioButtonT2=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input"));
        radioZeroToFive=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input"));
        radioFiveToFifteen=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input"));
        radioFifteenToFifty=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input"));
        buttonCheckT2=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
        messageAfterClickedT2=wb.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]"));

        return this;
    }
}