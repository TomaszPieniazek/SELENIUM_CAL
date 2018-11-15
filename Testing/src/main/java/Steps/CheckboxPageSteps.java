package Steps;

import PageObjects.CheckboxPage;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPageSteps extends Steps {
    CheckboxPage rbp;
    RemoteWebDriver rwd;

    @Given("user is on CheckboxPage")
    public void goToRBP() throws InterruptedException {
        rbp = new CheckboxPage(rwd);
        rwd = new ChromeDriver();
        rwd.manage().window().maximize();
        rwd.navigate().to(CheckboxPage.getUrlT());
        Thread.sleep(3000);
        PageFactory.initElements(rwd,rbp);
    }

    @When("user checks checkbox")
    public void writeSth() throws InterruptedException {
        rbp.getClickMeCheckbox().click();
        Thread.sleep(1500);
    }

    @Then("message should appear")
    public void resultShouldBeSameF(){
        org.junit.Assert.assertTrue(rbp.getMessage().getText()=="Success - Check box is checked");
    }

    @AfterScenario
    public void shutDown(){
        rwd.close();
    }

}
