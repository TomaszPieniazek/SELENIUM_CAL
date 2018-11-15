package Steps;

import PageObjects.RadioButtonPage;
import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RadioButtonPageSteps extends Steps {

    RadioButtonPage rbp;
    RemoteWebDriver rwd;

    @Given("user is on RadioButtonPage")
    public void goToRBP() throws InterruptedException {
        rwd = new ChromeDriver();
        rwd.manage().window().maximize();
        rwd.navigate().to("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        Thread.sleep(3000);
        rbp = new RadioButtonPage(rwd);
        rbp.initElements(rwd);

    }

    @When("user checks male button")
    public void checkMale() throws InterruptedException {
        rbp.maleCheckBoxClickT1();
        Thread.sleep(1500);
    }

    @When("user checks female button")
    public void checkFemale() throws InterruptedException {
        rbp.femaleCheckBoxClickT1();
        Thread.sleep(1500);
    }

    @When("user clicks Get Checked Value button")
    public void clickGetCheckedValue() throws InterruptedException {
        rbp.buttonCheckClickT1();
        Thread.sleep(1500);
    }


    @Then("result for male should be correct")
    public void resultShouldBeSame(){
        System.out.print(rbp.getMessageAfterClickedT1().getText());
        org.junit.Assert.assertTrue(rbp.getMessageAfterClickedT1().getText()=="Radio button 'Male' is checked");

    }

    @Then("result for female should be correct")
    public void resultShouldBeSameF(){
        System.out.print(rbp.getMessageAfterClickedT1().getText());
        org.junit.Assert.assertTrue(rbp.getMessageAfterClickedT1().getText()=="Radio button 'Female' is checked");
    }

    @AfterScenario
    public void shutDown(){
        rwd.close();
    }

}
