package ru.stqa.pft.eat;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

// import org.openqa.selenium.firefox.FirefoxDriver;

public class Product_test {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ ', '\"', 'СЕЙФЛАЙН', '\"', '')])[1]/following::button[1]")).click();

        // Выбираю создание ТРУ
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Избранное'])[1]/following::span[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои товары, работы, услуги'])[1]/following::button[1]"))).click();

        // Перешли к созданию ТРУ. Заполняю форму создания ТРУ
        driver.findElement(By.xpath("(.//*[@id=\"product-addition\"]/div[3]/div/div/div/div/div[2]/div[1]/ul/li[10]/div/div)")).click();
        driver.findElement(By.xpath("( //*[@id=\"product-addition\"]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/button/span)")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::input[1]")).sendKeys("Тест0502");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Торговое наименование'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Торговое наименование'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Торговое наименование'])[1]/following::input[1]")).sendKeys("Торговое_тест");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Наименование места происхождения товара'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Наименование места происхождения товара'])[1]/following::input[1]")).sendKeys("Место происхождение_тест");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Информация о производителе товара'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Информация о производителе товара'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Информация о производителе товара'])[1]/following::input[1]")).sendKeys("Производитель_тест");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фирменное наименование (при наличии)'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фирменное наименование (при наличии)'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фирменное наименование (при наличии)'])[1]/following::input[1]")).sendKeys("Фирменное наименование_тест");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[2]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[2]/following::input[1]")).sendKeys("150");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[3]/following::div[3]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Не облагается'])[1]/following::span[6]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[4]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[4]/following::input[1]")).sendKeys("100");

        // Остановился здесь. Надо придумать как переходить на следующий месяц в календаре
        driver.findElement(By.xpath(".//div[@class='vdp-datepicker input-form input-form--medium']//input[1]")).click();
        driver.findElement(By.xpath(".//div[@class='vdp-datepicker input-form input-form--medium']//input[1]")).sendKeys("25112025");
        WebElement upload = driver.findElement(By.id("file"));
        upload.sendKeys("C:\\Users\\k.ermakov\\Desktop\\тест типов\\картинка на предложения.jpg");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Единица измерения'])[2]/following::span[1]")).click();
        driver.findElement(By.name("productOfferExtraFeatures[0][name]")).click();
        driver.findElement(By.name("productOfferExtraFeatures[0][name]")).click();
        driver.findElement(By.name("productOfferExtraFeatures[0][name]")).clear();
        driver.findElement(By.name("productOfferExtraFeatures[0][name]")).sendKeys("Хар1");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Единица измерения'])[2]/following::div[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Качественная'])[1]/following::span[2]")).click();
        driver.findElement(By.name("productOfferExtraFeatures[0][qualityValue][]")).click();
        driver.findElement(By.name("productOfferExtraFeatures[0][qualityValue][]")).clear();
        driver.findElement(By.name("productOfferExtraFeatures[0][qualityValue][]")).sendKeys("тест1");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='+'])[1]/following::div[3]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Дециметр'])[1]/following::span[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='List is empty.'])[3]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Редактировать'])[1]/following::span[1]")).click();
        driver.findElement(By.name("productOfferExtraFeatures[1][name]")).click();
        driver.findElement(By.name("productOfferExtraFeatures[1][name]")).clear();
        driver.findElement(By.name("productOfferExtraFeatures[1][name]")).sendKeys("Хар2");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Редактировать'])[1]/following::div[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Качественная'])[1]/following::span[2]")).click();
        driver.findElement(By.name("productOfferExtraFeatures[1][qualityValue][]")).click();
        driver.findElement(By.name("productOfferExtraFeatures[1][qualityValue][]")).clear();
        driver.findElement(By.name("productOfferExtraFeatures[1][qualityValue][]")).sendKeys("тест2");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='List is empty.'])[2]/following::div[3]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='×'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='×'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='×'])[1]/following::input[1]")).sendKeys("тест3");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='+'])[1]/following::div[3]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='+'])[1]/following::span[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='List is empty.'])[3]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::input[1]")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::input[1]")).sendKeys("обл Рязанская, г Рязань");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::input[1]")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("delivery[0][transport_cost]")).click();
        driver.findElement(By.name("delivery[0][transport_cost]")).clear();
        driver.findElement(By.name("delivery[0][transport_cost]")).sendKeys("20");
        driver.findElement(By.name("delivery[0][max]")).click();
        driver.findElement(By.name("delivery[0][max]")).clear();
        driver.findElement(By.name("delivery[0][max]")).sendKeys("20");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::input[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::input[5]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::input[5]")).sendKeys("тест");
        driver.findElement(By.name("delivery[0][times]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сроки поставки, дни'])[1]/following::i[1]"))).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сохранить'])[1]/following::span[1]")).click();
    }



    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
     //   driver.quit();
        String url1 ="jdbc:mysql://192.168.168.6:3306/magento2";
        String dbClass = "com.mysql.jdbc.Driver";
        Class.forName(dbClass).newInstance();
        Connection con = DriverManager.getConnection(url1, "root", "tmp");
        Statement stmt = con.createStatement();
   //     ResultSet rs = stmt.executeQuery("select * from b2bclient_organization where organization_id = 919786;");
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
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

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
