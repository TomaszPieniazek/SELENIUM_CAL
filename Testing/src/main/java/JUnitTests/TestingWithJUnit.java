package JUnitTests;

import PageObjects.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestingWithJUnit {
    private RemoteWebDriver wb;
    private RadioButtonPage rbp;
    private CheckboxPage cp;
    private SimpleFormDemoPage sfdp;
    private AjaxFormSubmitPage afsp;
    private InputFormSubmitPage ifsp;
    private TableSearchFilterPage tsfp;
    private final String path="C:\\Users\\Tomasz\\Desktop\\eclipse\\chromedriver.exe";

    public boolean isElementPresent(WebElement w){
        boolean result = false;
        WebElement x = w;
        if(w!=null){
            result=true;
        }

        return result;
    }

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",path);
        wb = new ChromeDriver();
        wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wb.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void maleTestT1() throws Exception {
        rbp = new RadioButtonPage(wb);
        rbp.openViaUrl(RadioButtonPage.getUrl());
        rbp.initElements(wb);
        rbp.maleCheckBoxClickT1();
        rbp.buttonCheckClickT1();

        Assert.assertEquals("Radio button 'Male' is checked",rbp.getMessageAfterClickedT1().getText());
    }

    @Test
    public void femaleTestT1() throws Exception {
        rbp = new RadioButtonPage(wb);
        rbp.openViaUrl(RadioButtonPage.getUrl());
        rbp.initElements(wb);
        rbp.femaleCheckBoxClickT1();
        rbp.buttonCheckClickT1();

        Assert.assertEquals("Radio button 'Female' is checked",rbp.getMessageAfterClickedT1().getText());
    }

    @Test
    public void nothingCheckedTestT1() throws Exception {
        rbp = new RadioButtonPage(wb);
        rbp.openViaUrl(RadioButtonPage.getUrl());
        rbp.initElements(wb);
        rbp.buttonCheckClickT1();

        Assert.assertEquals("Radio button is Not checked",rbp.getMessageAfterClickedT1().getText());
    }

    @Test
    public void maleFifteenToFiftyTest() throws Exception {
        rbp=new RadioButtonPage(wb);
        rbp.openViaUrl(RadioButtonPage.getUrl());
        rbp.initElements(wb);
        rbp.maleCheckBoxClickT2();
        rbp.radioFifteenToFiftyClick();
        rbp.buttonCheckClickT2();

        Assert.assertEquals("Sex : Male\n" + "Age group: 15 - 50",rbp.getMessageAfterClickedT2().getText());
    }

    @Test
    public void femaleZeroToFive() throws Exception {
        rbp=new RadioButtonPage(wb);
        rbp.openViaUrl(RadioButtonPage.getUrl());
        rbp.initElements(wb);
        rbp.femaleCheckBoxClickT2();
        rbp.radioZeroToFiveClick();
        rbp.buttonCheckClickT2();

        Assert.assertEquals("Sex : Female\n" + "Age group: 0 - 5",rbp.getMessageAfterClickedT2().getText());
    }

    @Test
    public void nothingChckedT2() throws Exception {
        rbp=new RadioButtonPage(wb);
        rbp.openViaUrl(RadioButtonPage.getUrl());
        rbp.initElements(wb);
        rbp.buttonCheckClickT2();

        Assert.assertEquals("Sex :\n" + "Age group:",rbp.getMessageAfterClickedT2().getText());
    }

    @Test
    public void maleNothingCheckedT2() throws Exception {
        rbp=new RadioButtonPage(wb);
        rbp.openViaUrl(RadioButtonPage.getUrl());
        rbp.initElements(wb);
        rbp.maleCheckBoxClickT2();
        rbp.buttonCheckClickT2();

        Assert.assertEquals("Sex : Male\n" + "Age group:",rbp.getMessageAfterClickedT2().getText());
    }

    @Test
    public void nothingFiveFifteenCheckedT2() throws Exception {
        rbp=new RadioButtonPage(wb);
        rbp.openViaUrl(RadioButtonPage.getUrl());
        rbp.initElements(wb);
        rbp.radioFiveToFifteenClick();
        rbp.buttonCheckClickT2();

        Assert.assertEquals("Sex :\n" + "Age group: 5 - 15",rbp.getMessageAfterClickedT2().getText());
    }

    @Test
    public void ajaxPresent(){
        afsp= new AjaxFormSubmitPage(wb);
        afsp.openViaUrl(AjaxFormSubmitPage.getUrl());
        PageFactory.initElements(wb,afsp);
        Assert.assertTrue(isElementPresent(afsp.getCommentInput()));
    }

    @Test
    public void inputFormFirstNamePresent(){
        ifsp= new InputFormSubmitPage(wb);
        ifsp.openViaUrl(InputFormSubmitPage.getUrl());
        PageFactory.initElements(wb,ifsp);
        Assert.assertTrue(isElementPresent(ifsp.getFirstName()));
    }

    @Test
    public void inputFormLastNamePresent(){
        ifsp= new InputFormSubmitPage(wb);
        ifsp.openViaUrl(InputFormSubmitPage.getUrl());
        PageFactory.initElements(wb,ifsp);
        Assert.assertTrue(isElementPresent(ifsp.getLastName()));
    }

    @Test
    public void inputFormStatePresent(){
        ifsp= new InputFormSubmitPage(wb);
        ifsp.openViaUrl(InputFormSubmitPage.getUrl());
        PageFactory.initElements(wb,ifsp);
        Assert.assertTrue(isElementPresent(ifsp.getState()));
    }

    @Test
    public void checkboxPresent(){
        cp= new CheckboxPage(wb);
        cp.openViaUrl(CheckboxPage.getUrlT());
        PageFactory.initElements(wb,cp);
        Assert.assertTrue(cp.isElementPresent(cp.getClickMeCheckbox()));
    }

    @Test
    public void tableSearchFilterPageSmoke(){
        tsfp= new TableSearchFilterPage(wb);
        tsfp.openViaUrl(TableSearchFilterPage.getUrl());
        PageFactory.initElements(wb,tsfp);
        Assert.assertTrue(tsfp.isElementPresent(tsfp.getFilterInput()));
        Assert.assertTrue(tsfp.isElementPresent(tsfp.getInputMessage()));
        Assert.assertTrue(tsfp.isElementPresent(tsfp.getShowMessageButton()));
        Assert.assertTrue(tsfp.isElementPresent(tsfp.getShowResult()));
        Assert.assertTrue(tsfp.isElementPresent(tsfp.getSpanMessage()));
        Assert.assertTrue(tsfp.isElementPresent(tsfp.getTotalButton()));

        sfdp= new SimpleFormDemoPage(wb);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3500);
        wb.close();
        wb.quit();
    }
}
