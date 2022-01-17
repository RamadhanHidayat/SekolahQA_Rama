package module_search;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Proceed_Pay_Rooms_in_Shopping_cart {
    @Test
    public void SC3_TC1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/a")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]/a[1]")) != null) {
            System.out.println("General Room is Present");
        } else {
            System.out.println("General Room is Absent");
        }
        driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"id_gender\"]/option[1]")).click();

        WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        WebElement EmailProcced = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement Password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        WebElement PhoneNum = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));

        Firstname.sendKeys("Ramadhan");
        Thread.sleep(2000);
        LastName.sendKeys("Hidayat");
        Thread.sleep(2000);
        EmailProcced.sendKeys("Antarcticite002@gmail.com");
        Thread.sleep(2000);
        Password.sendKeys("test001");
        Thread.sleep(2000);
        PhoneNum.sendKeys("082136105057");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"opc_account_errors\"]")) != null) {
            System.out.println("Error Notifis Present");
        } else {
            System.out.println("Error Notif is Absent");
        }

        WebElement ErrorNotif = driver.findElement(By.xpath("//*[@id=\"opc_account_errors\"]"));
        Assert.assertEquals(true, ErrorNotif.isDisplayed());

        System.out.println("SC3_TC1 : Pay rooms with Registed account complete");

        driver.close();
    }

    @Test
    public void SC3_TC2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/a")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]/a[1]")) != null) {
            System.out.println("General Room is Present");
        } else {
            System.out.println("General Room is Absent");
        }
        driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"id_gender\"]/option[1]")).click();

        WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        WebElement EmailProcced = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement Password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        WebElement PhoneNum = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));

        Firstname.sendKeys("Ramadhan");
        Thread.sleep(2000);
        LastName.sendKeys("Hidayat");
        Thread.sleep(2000);
        EmailProcced.sendKeys("Testttttegvsbg005@gmail.com");
        Thread.sleep(2000);
        Password.sendKeys("test001");
        Thread.sleep(2000);
        PhoneNum.sendKeys("082136105057");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"collapse-guest-info\"]/div/div[4]/div/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p[1]")) != null) {
            System.out.println("Notif pembayaran berhasil is Present");
        } else {
            System.out.println("Notif pembayaran berhasil is Absent");
        }
        WebElement NotifPembayaranBerhasil = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p[1]"));

        Assert.assertEquals(true, NotifPembayaranBerhasil.isDisplayed());

        System.out.println("SC3_TC2 : Pay rooms with UnRegisted and Reg account complete");

        driver.close();

    }
    @Test
    public void Scenario() {

        System.out.println("Scenario Procced By Room in shopping cart Success");
    }

}
