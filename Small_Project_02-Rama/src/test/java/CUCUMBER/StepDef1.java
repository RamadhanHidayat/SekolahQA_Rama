package CUCUMBER;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef1 {
    private WebDriver driver;

    @Before
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //driver = new ChromeDriver();

    }
    @Given("^I want to write a step with precondition$")
    public void iWantToWriteAStepWithPrecondition() {
        //WebDriver driver = new ChromeDriver();
        driver.get("http://qa.cilsy.id:31300/id/");

    }

    @When("^I complete action$")
    public void iCompleteAction() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a")).click();

    }

    @Then("^I validate the outcomes$")
    public void iValidateTheOutcomes() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
