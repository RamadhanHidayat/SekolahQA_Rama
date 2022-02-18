package Module_GroupChat;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SC_02_Fitur_Type_massage {

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
    public void TC01_InputTExt_HurufAngka() throws InterruptedException {
        driver.get("https://staging.cicle.app/group-chats/61fd1d0e835d698459fc4841");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/h1")).isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div")).sendKeys("1234abcd *ೃ༄: ̗̀➛☄. *ੈ✩‧₊˚✧.*༘ *・❥・ೃ⁀➷-‘๑’-.ೃ࿐*ੈ✩‧₊˚˚₊· ͟͟͞͞➳❥┊͙ ˘﹉┊╭──╯ . . . .♡.﹀﹀﹀﹀.♡-- -͙-︶︶︶︶╭┈◦•◦❥ ");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".rounded-circle")).click();
    }

    @Test
    public void TC03_InputTExt_Blank() throws InterruptedException {
        driver.get("https://staging.cicle.app/group-chats/61fd1d0e835d698459fc4841");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/h1")).isDisplayed());

        driver.findElement(By.cssSelector(".rounded-circle")).click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/h1")).isDisplayed());

    }

}

