package module_login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing_Create_Account_Feature {
    @Test
    public void SC1_TC1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement LoginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("hide_xs")));

        driver.findElement(By.className("hide_xs")).click();

        Thread.sleep(2000);

        WebElement EmailDaftar = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        //email
        EmailDaftar.sendKeys("testemail001@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
        Thread.sleep(2000);


        WebElement Firstname = driver.findElement(By.id("customer_firstname"));

        WebElement LastName = driver.findElement(By.id("customer_lastname"));

        WebElement EmailDaftarDlm = driver.findElement(By.id("email"));

        WebElement PasswordDaftar = driver.findElement(By.id("passwd"));

        Firstname.sendKeys("Ramadhan");
        Thread.sleep(2000);

        LastName.sendKeys("Hidayat");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).clear();

        //email
        EmailDaftarDlm.sendKeys("testemail001@gmail.com");
        Thread.sleep(2000);

        //password
        PasswordDaftar.sendKeys("test002");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"days\"]/option[16]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[6]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[22]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
        Thread.sleep(2000);

        System.out.println("SC1_TC1 : Create Account with correct step complete");

        driver.close();

    }

    @Test
    public void SC1_TC3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement LoginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("hide_xs")));

        driver.findElement(By.className("hide_xs")).click();

        Thread.sleep(2000);

        WebElement EmailDaftar = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        //email
        EmailDaftar.sendKeys("antarcticite002@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        Thread.sleep(2000);

        //Verify Elemento
        if(driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol"))!= null){
            System.out.println("Notif is Present");
        }else{
            System.out.println("Notif is Absent");
        }

        System.out.println("SC1_TC3 : Create account with Already register account Complete");

        driver.close();


    }

    public void Scenario2() {

        System.out.println("Scenario Testing Create Account Feature Success");
    }
}