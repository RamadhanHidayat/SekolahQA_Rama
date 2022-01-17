package module_search;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_Now_Bar_Feature {
    @Test
    public void SC1_TC1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement HotelLocation = driver.findElement(By.id("hotel_location"));

        HotelLocation.sendKeys("indonesia");
        Thread.sleep(4000);

        System.out.println("SC1_TC1 : Input Hotel Location Input testing complete");

        driver.close();

    }

    @Test
    public void SC1_TC2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"id_hotel_button\"]")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"search_hotel_block_form\"]/div[2]/div/ul/li")).click();
        Thread.sleep(2000);

        System.out.println("SC1_TC2 : Select Hotel complete");

        driver.close();

    }

    @Test
    public void SC1_TC4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"check_out_time\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[6]/td[2]/a")).click();
        Thread.sleep(2000);

        System.out.println("SC1_TC4 : Input Check Out date complete");

        driver.close();
    }

    @Test
    public void SC1_TC3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"check_in_time\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[6]/td[2]/a")).click();
        Thread.sleep(2000);

        System.out.println("SC1_TC3 ; Check in date complete");

        driver.close();

    }

    @Test
    public void SC1_TC5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement SearchButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"search_room_submit\"]")));

        SearchButton.click();

        Thread.sleep(4000);

        System.out.println("SC1_TC5 : Testing Search now without filling anything complete");

        driver.close();
    }

    @Test
    public void SC1_TC6() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement HotelLocation = driver.findElement(By.id("hotel_location"));

        HotelLocation.sendKeys("indo");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"id_hotel_button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"search_hotel_block_form\"]/div[2]/div/ul")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"check_in_time\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[6]/td[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[3]/a")).click();
        Thread.sleep(2000);

        WebElement SearchButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"search_room_submit\"]")));

        SearchButton.click();

        WebElement OBJECT1 = driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]"));
        Assert.assertEquals(true, OBJECT1.isDisplayed());

        if(driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/p[1]"))!= null){
            System.out.println("General Room is Present");
        }else{
            System.out.println("general Room is Absent");
        }

        Thread.sleep(4000);

        System.out.println("SC1_TC6 : Testing Search now with Fill all collumn complete");

        driver.close();
    }

    @Test
    public void Scenario() {

        System.out.println("Scenario Search now bar Success");
    }
}