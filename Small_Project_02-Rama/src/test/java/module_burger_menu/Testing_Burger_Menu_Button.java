package module_burger_menu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing_Burger_Menu_Button {
    @Test
    public void SC1_TC1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[1]/a")) != null) {
            System.out.println("Home is Present");
        } else {
            System.out.println("Home is Absent");
        }

        WebElement Homie = driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[1]/a"));
        Assert.assertEquals(true, Homie.isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[1]/span")).click();
        Thread.sleep(2000);

        System.out.println("SC1_TC1 : Open Burger Menu at Home complete");

        driver.close();

    }

    @Test
    public void SC1_TC2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[1]/a")).click();
        Thread.sleep(2000);

        WebElement BurgerMenu = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button"));
        Assert.assertEquals(true, BurgerMenu.isDisplayed());

        System.out.println("SC1_TC2 : Click Home on Burger Menu complete");

        driver.close();

    }

    @Test
    public void SC1_TC3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[2]/a")).click();
        Thread.sleep(2000);

        WebElement KananKlik = driver.findElement(By.xpath("//*[@id=\"hotelInteriorBlock\"]/div/div[2]/div/div/div[2]/div[2]/div/div/div"));
        Assert.assertEquals(true, KananKlik.isDisplayed());

        System.out.println("SC1_TC3 : Click Interior on Burger Menu complete");

        driver.close();
    }

    @Test
    public void SC1_TC4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[3]/a")).click();
        Thread.sleep(2000);

        WebElement AminitiesText = driver.findElement(By.xpath("//*[@id=\"hotelAmenitiesBlock\"]/div/div[1]/div/p[1]"));
        Assert.assertEquals(true, AminitiesText.isDisplayed());

        System.out.println("SC1_TC4 : Click Amenities on Burger Menu complete");

        driver.close();
    }

    @Test
    public void SC1_TC5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[4]/a")).click();
        Thread.sleep(2000);

        WebElement VerivyElement = driver.findElement(By.xpath("//*[@id=\"hotelRoomsBlock\"]/div/div[1]/div/p[1]"));
        Assert.assertEquals(true, VerivyElement.isDisplayed());

        System.out.println("SC1_TC5 : Click Rooms on Burger Menu complete");

        driver.close();
    }

    @Test
    public void SC1_TC6() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[5]/a")).click();
        Thread.sleep(2000);

        WebElement VerivyElement = driver.findElement(By.xpath("//*[@id=\"hotelTestimonialBlock\"]/div/div[1]/div/p[1]"));
        Assert.assertEquals(true, VerivyElement.isDisplayed());

        System.out.println("SC1_TC6 : Click Testimonials on Burger Menu complete");

        driver.close();
    }

    @Test
    public void SC1_TC7() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[6]/a")).click();
        Thread.sleep(2000);

        WebElement VerivyElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/h2"));
        Assert.assertEquals(true, VerivyElement.isDisplayed());

        System.out.println("SC1_TC7 : Click Kebijakan privasi dan hukum on Burger Menu complete");

        driver.close();
    }

    @Test
    public void SC1_TC8() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[7]/a")).click();
        Thread.sleep(2000);

        WebElement VerivyElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/h2"));
        Assert.assertEquals(true, VerivyElement.isDisplayed());

        System.out.println("SC1_TC8 : Click Tentang kami on Burger Menu complete");

        driver.close();
    }

    @Test
    public void SC1_TC9() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[8]/a")).click();
        Thread.sleep(2000);

        WebElement VerivyElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/p[1]"));
        Assert.assertEquals(true, VerivyElement.isDisplayed());

        System.out.println("SC1_TC9 : Click Contact on Burger Menu complete");

        driver.close();
    }

    @Test
    public void Scenario() {

        System.out.println("Testing burger menu button Success");
    }


}