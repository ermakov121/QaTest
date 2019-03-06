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

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

//import org.openqa.selenium.ie.InternetExplorerDriver;

// import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthorizationIsSellerUl {
    public WebDriver driver;
    public String baseUrl;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Variables.url_ft);
    }


    @Test
    public void testUntitledTestCase() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);  // Создаю объект для ожидания элементов
        driver.findElement(Variables.lk).click();  // Нажимаю "Личный кабинет"
        wait.until(ExpectedConditions.elementToBeClickable(Variables.input)).click();  // Нажимаю "Вход"
        driver.findElement(Variables.cont).click();  // Нажимаю "Продолжить"
        driver.findElement(Variables.nov_1).click();  // Открывается выпадающий список
        driver.findElement(Variables.is_seller).click();  //Выбираю "Поставщик"
        sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Variables.auth)).click(); // Нажимаю "Аутентификация"
        driver.findElement(Variables.phone).sendKeys("+79537443839"); // Ввожу номер телефона в поле в ЕСИА
        driver.findElement(Variables.password).sendKeys("Holloway121");  // Пароль
        driver.findElement(Variables.input_2).click();  // Нажимаю "Войти" в ЕСИА
        driver.findElement(Variables.orga).click();  // Выбираю организацию ЮЛ "Сейфлайн" в ЕСИА
        driver.findElement(Variables.input_3).click(); // Нажимаю "Подвердить" в ЕСИА
     //   sleep(3000);
        if (isElementPresent(Variables.check) == true) {   // Проверяю есть ли окошко выбора агентов
            driver.findElement(Variables.orga_2).click();  // Выбираю "Сеййлайн" в окошке выбора агентов
            driver.findElement(Variables.input_4).click();  // Нажимаю "Подтвердить" в окошке выбора агентов
        }
    }

    @AfterClass(alwaysRun = true)
    private void tearDown() {
        try {
            String actual = ("ООО \"СЕЙФЛАЙН\"");
            assertEquals(actual, driver.findElement(By.xpath("//div[@class='col-xs-6 col-md-4']/div[@class='fs14 lh24']")).getText());
            System.out.println("Аутентификация успешна");
        } catch (AssertionError assertionError) {
            System.out.println("Аутентификация провалена");
        }
        driver.quit();
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void avto( By orga_choose) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);  // Создаю объект для ожидания элементов
        driver.findElement(Variables.lk).click();  // Нажимаю "Личный кабинет"
        wait.until(ExpectedConditions.elementToBeClickable(Variables.input)).click();  // Нажимаю "Вход"
        driver.findElement(Variables.cont).click();  // Нажимаю "Продолжить"
        driver.findElement(Variables.nov_1).click();  // Открывается выпадающий список
        driver.findElement(Variables.is_seller).click();  //Выбираю "Поставщик"
        sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Variables.auth)).click(); // Нажимаю "Аутентификация"
        driver.findElement(Variables.phone).sendKeys("+79537443839"); // Ввожу номер телефона в поле в ЕСИА
        driver.findElement(Variables.password).sendKeys("Holloway121");  // Пароль
        driver.findElement(Variables.input_2).click();  // Нажимаю "Войти" в ЕСИА
        driver.findElement(orga_choose).click();  // Выбираю организацию ЮЛ "Сейфлайн" в ЕСИА
        driver.findElement(Variables.input_3).click(); // Нажимаю "Подвердить" в ЕСИА
    }
}