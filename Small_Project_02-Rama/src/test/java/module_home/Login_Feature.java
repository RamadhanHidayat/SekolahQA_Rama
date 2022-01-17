package module_home;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login_Feature {
    @Test
    public void SC1_TC1 ()throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");
//maximise window
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,3);

        WebElement LoginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("hide_xs")));

        driver.findElement(By.className("hide_xs")).click();
        Thread.sleep(2000);

//Verify Element
        WebElement Authentication = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
        Assert.assertEquals(true, Authentication.isDisplayed());

        if(driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"))!= null){
            System.out.println("Authentication is Present");
        }else{
            System.out.println("Authentication is Absent");
        }

        WebElement Email = driver.findElement(By.id("email"));

        WebElement PassWord = driver.findElement(By.id("passwd"));

        Email.sendKeys("antarcticite003@gmail.com");
        Thread.sleep(2000);

        PassWord.sendKeys("test001");
        Thread.sleep(2000);

        WebElement SubmitSign = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SubmitLogin\"]")));
        //driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

        SubmitSign.click();

        WebElement OrderHistory = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/ul/li[1]/a/span"));
        Assert.assertEquals(true, OrderHistory.isDisplayed());

        if(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/ul/li[1]/a/span"))!= null){
            System.out.println("Order History And Details is Present");
        }else{
            System.out.println("Order History And Details is Absent");
        }

        WebElement Object2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/ul/li[1]/a/span"));
        Assert.assertEquals(true, Object2.isDisplayed());

        Thread.sleep(4000);

        System.out.println("SC1_TC1 : Login with Registed account complete");

        driver.close();

    }

    @Test
    public void SC1_TC2 ()throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,3);

        WebElement LoginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("hide_xs")));

        driver.findElement(By.className("hide_xs")).click();

        WebElement Email = driver.findElement(By.id("email"));

        WebElement PassWord = driver.findElement(By.id("passwd"));

        Email.sendKeys("antarcticite003@gmail.com");

        PassWord.sendKeys("test001");

        WebElement SubmitSign = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SubmitLogin\"]")));

        //driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

        SubmitSign.click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"user_info_acc\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/ul/li[3]/a")).click();

        System.out.println("SC1_TC2 : Log Out account complete");

        Thread.sleep(4000);

        driver.close();

    }

    @Test
    public void Scenario() {

        System.out.println("Scenario Login Feature Success");
    }


}
