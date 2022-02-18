package Module_Blast;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SC_02_Create_Blast_Feature {
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
    public void TC01_GoToCreate_DirectURL() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("li.MuiBreadcrumbs-li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).isDisplayed());
    }

    @Test
    public void TC02_CreateBlast_WithoutStory() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("li.MuiBreadcrumbs-li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Blasttt");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[6]/div/button[1]/div")).click();
    }

    @Test
    public void TC03_CreateBlast_WithoutStoryAndTittle() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("li.MuiBreadcrumbs-li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[6]/div/button[1]/div")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div")).isDisplayed());
    }

    @Test
    public void TC04_CreateBlast_With_SetDueDate() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("li.MuiBreadcrumbs-li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div/textarea")).sendKeys("DueDateTest");
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("li.MuiButtonBase-root:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[6]/div/button[1]/div")).click();
    }

    @Test
    public void TC05_CreateBlast_Private() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("li.MuiBreadcrumbs-li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Private");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[5]/div[2]/label/span[1]/span[1]/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[6]/div/button[1]/div")).click();
    }

    @Test
    public void TC06_RemoveSubcriber() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("li.MuiBreadcrumbs-li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div/textarea")).sendKeys("RemoveSubs");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[1]/div")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[1]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[2]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[3]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[4]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[5]/p")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".ManageSubscribersContainer_ManageSubscribersContainer__Header__1jlWK > svg:nth-child(2)")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[6]/div/button[1]/div")).click();
    }

    @Test
    public void TC07_AddSubcriber() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("li.MuiBreadcrumbs-li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div/textarea")).sendKeys("AddSubs");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[1]/div")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[1]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[2]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[3]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[4]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[5]/p")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[1]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[2]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[3]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[4]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div[3]/div[3]/div[5]/p")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".ManageSubscribersContainer_ManageSubscribersContainer__Header__1jlWK > svg:nth-child(2)")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[6]/div/button[1]/div")).click();
    }
}
