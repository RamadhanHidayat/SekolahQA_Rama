package Module_Board;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SC_02_Mengecek_button_button_pada_fitur_board {

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
    public void TC01_Menuju_ke_board_melalui_home() throws InterruptedException {
        driver.get("https://staging.cicle.app/signin");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/nav/a/span/img")).isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[4]/a/div")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div/div[1]/h1")).isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[3]/div[4]/a/div/div")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]")).isDisplayed());
    }

    @Test
    public void TC02_Menuju_ke_board_melalui_Url() throws InterruptedException {
        driver.get("https://staging.cicle.app/boards/61fd1d0e835d695fb0fc483f");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/p")).isDisplayed());

    }

    @Test
    public void TC03_Klik_AddList() throws InterruptedException {
        driver.get("https://staging.cicle.app/boards/61fd1d0e835d695fb0fc483f");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[5]/button/div")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[5]/div/div/form/div[2]/div/button/div")).isDisplayed());
    }

    @Test
    public void TC04_Klik_AddCard() throws InterruptedException {
        driver.get("https://staging.cicle.app/boards/61fd1d0e835d695fb0fc483f");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[4]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[4]/div[3]/button/div")).click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[4]/div[3]/button/div")).isDisplayed());
    }

    @Test
    public void TC05_Klik_PaketSoalA_Header() throws InterruptedException {
        driver.get("https://staging.cicle.app/boards/61fd1d0e835d695fb0fc483f");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ol/li[3]/a/span")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[3]/div[4]/a/div")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[1]/nav/ol/li/a/span")).isDisplayed());
    }

    @Test
    public void TC06_Klik_Home_Header() throws InterruptedException {
        driver.get("https://staging.cicle.app/boards/61fd1d0e835d695fb0fc483f");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ol/li[1]/a/span")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[4]/a/div/h1")).isDisplayed());

    }

}

