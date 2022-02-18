package Module_Blast;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SC_01_Mengecek_Buttonbutton_pada_fitur_blast {

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
    public void TC01_GoTo_Blast_FromHome() throws InterruptedException {
        driver.get("https://staging.cicle.app/");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/nav/a/span/img")).isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[4]/a/div")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div/div[1]/h1")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[3]/div[2]/a/div/div/div[1]")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div[1]/h1")).isDisplayed());
    }

    @Test
    public void TC02_GoToBlast_DirectlyURL() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div[1]/h1")).isDisplayed());
    }

    @Test
    public void TC03_MebuatBlast() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div[1]/h1")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div[2]/button")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ol/li[5]/a/span")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Blast2");
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/p")).sendKeys("story1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[6]/div/button[1]/div")).click();
    }

    @Test
    public void TC04_Klik_ProfileMember() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div[1]/h1")).isDisplayed());

        driver.findElement(By.cssSelector("div.Post_Post__1nxel:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > img:nth-child(1)")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/img")).isDisplayed());
    }

    @Test
    public void TC05_Klik_paketSoalA_header() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div[1]/h1")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ol/li[3]/a/span")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/a/div")).isDisplayed());
    }

    @Test
    public void TC06_KlikHome_header() throws InterruptedException {
        driver.get("https://staging.cicle.app/blasts/61fd1d0e835d69f0ecfc4843");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div[1]/h1")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ol/li[1]/a/span")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[4]/a/div")).isDisplayed());
    }

}

