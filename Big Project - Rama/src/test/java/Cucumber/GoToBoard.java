/*
package Cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoToBoard {
    WebDriver driver;

    @Before
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\BrowserDrive\\chromedriver.exe");
        String userProfile = "C:\\SeleniumDrivers\\BrowserProfile";
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--user-data-dir=" + "C:\\Users\\acer\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("--user-data-dir=" + userProfile);
        //options.addArguments("profile-directory=Profile 8");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }


    @Given("I Login forst")
    public void iLoginForst() {

    }

    @When("I go to Board URL")
    public void iGoToBoardURL() throws InterruptedException {
        driver.get("https://staging.cicle.app/boards/61fd1d0e835d695fb0fc483f");
        Thread.sleep(2000);
    }

    @And("I came to Board")
    public void iCameToBoard() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/p")).isDisplayed());
        driver.quit();
    }

}
*/
