package ru.stqa.pft.eat;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

// import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthorizationIsSellerUl {
    private WebDriver driver;
    private String baseUrl;
  //  private boolean acceptNextAlert = true;
 //   private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //    driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://ft01.eat.dks.lanit.ru/");
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created with sketchtool.'])[1]/following::span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Инструкции по регистрации'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Войти как'])[1]/following::div[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказчик 223-ФЗ'])[1]/following::span[2]")).click();
        driver.findElement(By.linkText("Аутентификация")).click();
        driver.findElement(By.id("mobileOrEmail")).click();
        driver.findElement(By.id("mobileOrEmail")).clear();
        driver.findElement(By.id("mobileOrEmail")).sendKeys("+79537443839");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Holloway121");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Чужой компьютер'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ ', '\"', 'СЕЙФЛАЙН', '\"', '')])[1]/following::p[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ ', '\"', 'СЕЙФЛАЙН', '\"', '')])[1]/following::button[1]")).click();
        WebElement element =  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ОГРН'])[3]/following::span[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
        WebElement element1 =  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ОГРН'])[3]/following::button[1]"));
        executor.executeScript("arguments[0].click()", element1);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        try {
            String expected = ("ООО \"СЕЙФЛАЙН\"");
            String element = driver.findElement(By.cssSelector(".fs14.lh24")).getText();
            assertEquals(element, expected);
            driver.quit();
        }
        catch (NoSuchElementException e){
            System.out.println("Аутентификация провален");
        }
    }
}