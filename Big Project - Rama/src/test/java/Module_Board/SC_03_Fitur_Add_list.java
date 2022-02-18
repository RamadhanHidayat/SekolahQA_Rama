package Module_Board;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SC_03_Fitur_Add_list {

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
    public void TC01_Create_ListName() throws InterruptedException {
        driver.get("https://staging.cicle.app/boards/61fd1d0e835d695fb0fc483f");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[5]/button/div")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[5]/div/div/form/div[2]/div/button/div")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[5]/div/div/form/div[1]/input")).sendKeys("TestTest");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[5]/div/div/form/div[2]/div/button")).click();

    }


    @Test
    public void TC03_CreateList_Blank() throws InterruptedException {
        driver.get("https://staging.cicle.app/boards/61fd1d0e835d695fb0fc483f");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[5]/button/div")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[5]/div/div/form/div[2]/div/button/div")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[5]/div/div/form/div[2]/div/button")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div")).isDisplayed());

    }
}
