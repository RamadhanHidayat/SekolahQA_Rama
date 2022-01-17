package module_burger_menu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing_Contact_feature_on_Burger_Menu {
    @Test
    public void SC2_TC1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/hubungi-kami");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/div[2]/form/div[1]/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/div[2]/form/div[1]/div/div/ul/li[1]")).click();
        Thread.sleep(2000);

        WebElement VerivyElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/p[1]"));
        Assert.assertEquals(true, VerivyElement.isDisplayed());

        System.out.println("SC2_TC1 : Choose Costumer Service on contact complete");

        driver.close();

    }

    @Test
    public void SC2_TC2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/hubungi-kami");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/div[2]/form/div[1]/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/div[2]/form/div[1]/div/div/ul/li[2]")).click();
        Thread.sleep(2000);

        WebElement VerivyElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/p[1]"));
        Assert.assertEquals(true, VerivyElement.isDisplayed());

        System.out.println("SC2_TC2 : Choose Web master contact complete");

        driver.close();
    }

    @Test
    public void SC2_TC3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/hubungi-kami");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement EmailContact = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        EmailContact.sendKeys("Antarcticite002@gmail.com");
        Thread.sleep(2000);


        WebElement VerivyElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/p[1]"));
        Assert.assertEquals(true, VerivyElement.isDisplayed());

        System.out.println("SC2_TC3 : Input Email with registed account complete");

        Thread.sleep(2000);

        driver.close();

    }

    @Test
    public void SC2_TC4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/hubungi-kami");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement MessageQuery = driver.findElement(By.xpath("//*[@id=\"message\"]"));
        MessageQuery.sendKeys("Lessgooo");
        Thread.sleep(2000);

        WebElement VerivyElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/p[1]"));
        Assert.assertEquals(true, VerivyElement.isDisplayed());

        System.out.println("SC2_TC4 : Input Message/Query complete");

        Thread.sleep(2000);

        driver.close();

    }

    @Test
    public void Scenario() {

        System.out.println("Scenario Testing Contact Feature on burger menu Success");
    }


}