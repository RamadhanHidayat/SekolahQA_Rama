package CUCUMBER;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BurgerMenuDef {
    private WebDriver driver;

    @Before
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //WebDriver driver = new ChromeDriver();

    }
    @Given("I on the homepage")
    public void iOnTheHomepage() {
        driver.get("http://qa.cilsy.id:31300/id/");
    }

    @When("I Click Icon Burge Menu")
    public void iClickIconBurgeMenu() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
    }

    @And("I Click First menu")
    public void iClickFirstMenu() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[1]/a")).click();

        driver.close();
    }


}
