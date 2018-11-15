package Steps;

import PageObjects.SimpleFormDemoPage;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class SimpleDemoPageSteps extends Steps {

    SimpleFormDemoPage rbp;
    RemoteWebDriver rwd;

    @Given("user is on SimpleFormDemoPage")
    public void goToRBP() throws InterruptedException {
        rwd = new ChromeDriver();
        rwd.manage().window().maximize();
        rwd.navigate().to("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(3000);
        rbp = new SimpleFormDemoPage(rwd);
        PageFactory.initElements(rwd,rbp);
    }

    @When("user writes something")
    public void writeSth() throws InterruptedException {
        rbp.getInputMessage().sendKeys("AAAA");
        Thread.sleep(1500);
    }

    @When("user clicks Show Message button")
    public void clickGetCheckedValue() throws InterruptedException {
        rbp.getShowMessageButton().click();
        Thread.sleep(1500);
    }

    @When("user filss a and b")
    public void fillAndB() throws InterruptedException {
        rbp.getEnterA().sendKeys("3");
        rbp.getEnterB().sendKeys("5");
        Thread.sleep(1500);
    }

    @When("user clicks Get Total button")
    public void clickGetTotal() throws InterruptedException {
        rbp.getTotalButton().click();
        Thread.sleep(1500);
    }


    @Then("result should be same as user phrase")
    public void resultShouldBeSame(){
        org.junit.Assert.assertTrue(rbp.getSpanMessage().getText()=="AAAA");
        rwd.close();
    }

    @Then("result should equals exactly same")
    public void resultShouldBeSameF(){
        org.junit.Assert.assertTrue(rbp.getShowResult().getText()=="8");
    }

    @AfterScenario
    public void shutDown(){
        rwd.close();
    }

}
