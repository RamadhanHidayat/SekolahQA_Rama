package module_home;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Booking_Cart {
    @Test
    public void SC2_TC1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div")).click();
        Thread.sleep(2000);

        if(driver.findElement(By.xpath("//*[@id=\"content\"]/div/p"))!= null){
            System.out.println("Orange Notif is Present");
        }
        else{
            System.out.println("Orange Notif is Absent");
        }

        WebElement OBJECT1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p"));
        Assert.assertEquals(true, OBJECT1.isDisplayed());

        Thread.sleep(2000);

        System.out.println("SC2_TC1 : Testing empty Shoppingcart complete");

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

        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/a")).click();
        Thread.sleep(2000);

        //Assert
        WebElement Generalroom = driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]/a[1]"));
        Assert.assertEquals(true, Generalroom.isDisplayed());


        if(driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]/a[1]"))!= null){
            System.out.println("General Room is Present");
        }
        else{
            System.out.println("General Room is Absent");
        }

        WebElement OBJECT1 = driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]/a[1]"));
        Assert.assertEquals(true, OBJECT1.isDisplayed());


        System.out.println("SC2_TC2 : Testing filled Shoppingcart complete");

        driver.close();
    }


    //Test Suit Notification
    @Test
    public void Scenario() {

        System.out.println("Scenario Booking Cart Success");
    }
}
