package module_login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing_Login_Feature {
    @Test
    public void SC2_TC1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

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

        if (driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/ul/li[1]/a/span")) != null) {
            System.out.println("Order history and details is Present");
        } else {
            System.out.println("Order history and details is Absent");
        }

        System.out.println("SC2_TC1 : Login with Registed account complete");

        driver.close();
    }

    @Test
    public void SC2_TC2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement LoginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("hide_xs")));

        driver.findElement(By.className("hide_xs")).click();
        Thread.sleep(2000);

        WebElement Email = driver.findElement(By.id("email"));
        WebElement PassWord = driver.findElement(By.id("passwd"));

        Email.sendKeys("EmailTakTerdaftar@gmail.com");
        Thread.sleep(2000);
        PassWord.sendKeys("test001");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")) != null) {
            System.out.println("Error notif is Present");
        }
        else {
            System.out.println("Error notif is Absent");
        }

        System.out.println("SC2_TC2 : Login with UnRegisted account complete");

        driver.close();
    }

    public void Scenario() {

        System.out.println("Scenario Testing Login Feature Success");
    }
}