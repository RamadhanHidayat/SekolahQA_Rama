package Cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoToGroubChat {
    WebDriver driver;

    @Before
    public void startBrowser() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\BrowserDrive\\chromedriver.exe");
        String userProfile = "C:\\SeleniumDrivers\\BrowserProfile";
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--user-data-dir=" + "C:\\Users\\acer\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("--user-data-dir=" + userProfile);
        //options.addArguments("profile-directory=Profile 8");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Given("I Login")
    public void ILogin() throws InterruptedException{
        driver.get("https://staging.cicle.app/");
        Thread.sleep(2000);
    }

    @When("I go to Groubchat From HOme")
    public void IgotoGroubchatFromHOme() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[4]/a/div")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div/div[1]/h1")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[3]/div[1]/a/div/div/div[1]")).click();
        Thread.sleep(2000);
    }

    @Then("I came to Groubchat")
    public void IcametoGroubchat() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/h1")).isDisplayed());
        driver.quit();
    }
}

