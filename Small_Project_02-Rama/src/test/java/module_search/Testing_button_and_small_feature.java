package module_search;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing_button_and_small_feature {
    @Test
    public void SC4_TC1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath(("//*[@id=\"gst_rating\"]\n"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(("//*[@id=\"center_column\"]/div/div/div[1]/div[2]/div/ul/li[1]/a\n"))).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]")) != null) {
            System.out.println("Delux Room is Present");
        } else {
            System.out.println("Delux Room is Absent");
        }

        WebElement DeluxRooms = driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]"));
        Assert.assertEquals(true, DeluxRooms.isDisplayed());

        System.out.println("SC4_TC1 : Testing Fiture Sort By Ascending complete");

        driver.close();

    }

    @Test
    public void SC4_TC2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath(("//*[@id=\"gst_rating\"]\n"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(("//*[@id=\"center_column\"]/div/div/div[1]/div[2]/div/ul/li[2]/a"))).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]")) != null) {
            System.out.println("Delux Room is Present");
        } else {
            System.out.println("Delux Room is Absent");
        }

        WebElement DeluxRooms = driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]"));
        Assert.assertEquals(true, DeluxRooms.isDisplayed());

        System.out.println("SC4_TC2 : Testing Fiture Sort By Descending complete");

        driver.close();

    }

    @Test
    public void SC4_TC3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath(("//*[@id=\"price_ftr\"]"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(("//*[@id=\"center_column\"]/div/div/div[1]/div[3]/div/ul/li[1]/a"))).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]")) != null) {
            System.out.println("Delux Room is Present");
        } else {
            System.out.println("Delux Room is Absent");
        }

        WebElement DeluxRooms = driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]"));
        Assert.assertEquals(true, DeluxRooms.isDisplayed());

        System.out.println("SC4_TC3 : Testing Fiture Sort Price by lowest complete");

        driver.close();
    }

    @Test
    public void SC4_TC4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath(("//*[@id=\"price_ftr\"]"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(("//*[@id=\"center_column\"]/div/div/div[1]/div[3]/div/ul/li[2]/a"))).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]")) != null) {
            System.out.println("Delux Room is Present");
        } else {
            System.out.println("Delux Room is Absent");
        }

        WebElement DeluxRooms = driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]"));
        Assert.assertEquals(true, DeluxRooms.isDisplayed());

        System.out.println("SC4_TC4 : Testing Fiture Sort Price by highest complete");

        driver.close();
    }

    @Test
    public void SC4_TC5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//langsung ke order menu
        driver.get("http://qa.cilsy.id:31300/id/6-the-hotel-prime?date_from=2022-01-31&date_to=2022-02-01");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath(("//*[@id=\"filter_results\"]/div/div[2]/div[2]/div[1]/div/span/input"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//*[@id=\"filter_results\"]/div/div[2]/div[2]/div[2]/div/span/input"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//*[@id=\"filter_results\"]/div/div[2]/div[2]/div[3]/div/span/input"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//*[@id=\"filter_results\"]/div/div[2]/div[2]/div[4]/div/span/input"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//*[@id=\"filter_results\"]/div/div[2]/div[2]/div[5]/div/span/input"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//*[@id=\"filter_results\"]/div/div[2]/div[2]/div[6]/div/span/input"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//*[@id=\"filter_results\"]/div/div[2]/div[2]/div[7]/div/span/input"))).click();
        Thread.sleep(1000);

        System.out.println("SC4_TC5 : Testing ChecBox on Amenities complete");

        driver.close();
    }

    @Test
    public void Scenario() {

        System.out.println("Scenario Testing button and small feature Success");
    }

}