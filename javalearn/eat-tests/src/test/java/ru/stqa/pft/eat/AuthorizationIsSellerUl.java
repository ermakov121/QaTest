package ru.stqa.pft.eat;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

//import org.openqa.selenium.ie.InternetExplorerDriver;

// import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthorizationIsSellerUl {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ft01.eat.dks.lanit.ru/");
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.findElement(By.xpath(".//*[@id=\"viewport\"]/div[2]/header/div[1]/div/div[4]/div/div[2]/span")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[1]/following::button[1]"))).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Инструкции по регистрации'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Войти как'])[1]/following::div[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказчик 223-ФЗ'])[1]/following::span[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[@href=\"/esialogin?federal_law=0&disable-individual=false&magento_redirect_url=https://ft01.eat.dks.lanit.ru/\"])"))).click();
        driver.findElement(By.id("mobileOrEmail")).click();
        driver.findElement(By.id("mobileOrEmail")).clear();
        driver.findElement(By.id("mobileOrEmail")).sendKeys("+79537443839");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Holloway121");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Чужой компьютер'])[1]/following::span[1]")).click();

        // выбираю ООО Сейфлайн

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ ', '\"', 'СЕЙФЛАЙН', '\"', '')])[1]/following::p[1]")).click();

        // выбираю ФЛ
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ ', '\"', 'СЕЙФЛАЙН', '\"', '')])[1]/following::button[1]")).click();
        Thread.sleep(5000);
        boolean x = elementPresent();
          if (x == true){
            driver.findElement(By.xpath(".//*[text()='ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"СЕЙФЛАЙН\"']/..")).click();
            driver.findElement(By.cssSelector(".btn.btn--primary")).click();
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        String expected = ("ООО \"ЕЙФЛАЙН\"");
        String element = driver.findElement(By.cssSelector(".fs14.lh24")).getText();
        if (element == expected){
            System.out.println("Аутентификация провалена");
        }
        else{
            System.out.println("Аутентификация успешна");
        }
        driver.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean elementPresent() {
        try {
            String expected = "Выберите организацию";
            String element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[1]/following::div[4]")).getText();
            assertEquals(element, expected);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}