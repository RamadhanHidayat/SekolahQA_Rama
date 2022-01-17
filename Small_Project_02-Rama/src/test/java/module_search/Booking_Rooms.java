package module_search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Booking_Rooms {
    @Test
    public void SC2_TC1() throws InterruptedException {

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

        System.out.println("SC2_TC1 : Booking General room Complete");

        driver.close();
    }

    @Test
    public void SC2_TC2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[2]/div/div[2]/a/span ")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/a")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]/a[1]")) != null) {
            System.out.println("Delux Room is Present");
        } else {
            System.out.println("delux Room is Absent");
        }

        System.out.println("SC2_TC2 : Booking Delux room complete");

        driver.close();
    }

    @Test
    public void SC2_TC3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[3]/div/div[2]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/a")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]/a[1]")) != null) {
            System.out.println(" Room is Present");
        } else {
            System.out.println(" Room is Absent");
        }

        System.out.println("SC2_TC3 : Booking Exclusive room complete");

        driver.close();
    }

    @Test
    public void SC2_TC4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[4]/div/div[2]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/a")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]/a[1]")) != null) {
            System.out.println(" Room is Present");
        } else {
            System.out.println(" Room is Absent");
        }

        System.out.println("SC2_TC4 : Booking Luxury room complete");

        driver.close();
    }
    @Test
    public void Scenario() {

        System.out.println("Scenario Rooms Cart Success");
    }
}