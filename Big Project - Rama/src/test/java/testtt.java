import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testtt {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\BrowserDrive\\chromedriver.exe");
        String userProfile = "C:\\SeleniumDrivers\\BrowserProfile";
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--user-data-dir=" + "C:\\Users\\acer\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("--user-data-dir=" + userProfile);
        //options.addArguments("profile-directory=Profile 8");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();

    }

    @Test
    public void TC0() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("li.MuiBreadcrumbs-li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).isDisplayed());

        driver.findElement(By.xpath("")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
    }

}
