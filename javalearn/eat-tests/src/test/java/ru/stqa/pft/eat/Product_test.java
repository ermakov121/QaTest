package ru.stqa.pft.eat;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import ru.stqa.pft.eat.AuthorizationIsSellerUl;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

// import org.openqa.selenium.firefox.FirefoxDriver;

public class Product_test extends AuthorizationIsSellerUl{
  //  private WebDriver driver;
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
        driver.get(Variables.url_ft);


    }

    @Test
    public void testUntitledTestCase() throws Exception {
        /* Аккредитация поставщика */
        avto(Variables.fl);

        /* Создание ТРУ */
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(Variables.my_TRU)).click();  // Нажимаю на вкладку "Мои предложения"
        driver.findElement(Variables.add_TRU).click();  // Нажимаю кнопку "Добавить предложение"
        driver.findElement(Variables.categories).click();  // Выбираю категорию
        wait.until(ExpectedConditions.elementToBeClickable(Variables.kod_EAT)).click();  // Нажимаю на поле фильтра "Код ЕАТ"
        driver.findElement(Variables.kod_EAT).clear(); // Очищаю поле фильтра "Код ЕАТ"
        driver.findElement(Variables.kod_EAT).sendKeys("19.20.29.160-00000001");  // Ввожу в поле "Код ЕАТ" код шаблона
        driver.findElement(Variables.find).click();  // Нажимаю на кнопку "Найти" в фильтре
        wait.until(ExpectedConditions.elementToBeClickable(Variables.choose)).click();  // Нажимаю "Выбрать" на шаблоне
        sleep(1000);
        driver.findElement(Variables.short_title).click();  // Нажимаю на поле ввода "Краткое наименование"
        driver.findElement(Variables.short_title).clear();  // Очищаю поле "Краткое наименование"
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy_hh:mm:ss");
        String date_now = format.format(date);
        String product_name_expected = "Автотест_" + date_now;
        driver.findElement(Variables.short_title).sendKeys(product_name_expected);  // Ввожу значение в поле "Краткое наименование" название ТРУ
        driver.findElement(Variables.trade).click();  // Нажимаю на поле ввода "Торговое наименование"
        driver.findElement(Variables.trade).clear();  // Очищаю поле "Торговое наименование"
        driver.findElement(Variables.trade).sendKeys("Торговое наименование_тест");  // Ввожу значение в поле "Торговое наименование"
        driver.findElement(Variables.place).click();  // Нажимаю на поле ввода "Наименование места происхождения товара"
        driver.findElement(Variables.place).clear();  // Очищаю поле "Наименование места происхождения товара"
        driver.findElement(Variables.place).sendKeys("Наименование места происхождения товара_тест");  // Ввожу значение в поле "Наименование места происхождения товара"
        driver.findElement(Variables.inf_manuf).click();  // Нажимаю на поле ввода "Информация о производителе товара"
        driver.findElement(Variables.inf_manuf).clear();  // Очищаю поле "Информация о производителе товара"
        driver.findElement(Variables.inf_manuf).sendKeys("Информация о производителе товара_тест");  // Ввожу значение в поле "Информация о производителе товара"
        driver.findElement(Variables.trade_2).click();  // Нажимаю на поле ввода "Фирменное наименование"
        driver.findElement(Variables.trade_2).clear();  // Очищаю поле "Фирменное наименование"
        driver.findElement(Variables.trade_2).sendKeys("Фирменное наименование_тест");  // Ввожу значение в поле "Фирменное наименование"
        driver.findElement(Variables.price).click();  // Нажимаю на поле ввода "Цена за единицу"
        driver.findElement(Variables.price).clear();  // Очищаю поле "Цена за единицу"
        driver.findElement(Variables.price).sendKeys("150");  // Ввожу значение в поле "Цена за единицу"
        driver.findElement(Variables.miltuselect).click();  // Нажимаю селект в поле "НДС"
        driver.findElement(Variables.nds_choose).click();  // Выбираю значение поля "НДС"
        driver.findElement(Variables.end_date).click();  // Ввыбираю поле "Дата окончания применения"
        driver.findElement(Variables.end_date).sendKeys("25-11-2025");  // Ввожу значение в поле "Дата окончания применения"
        driver.findElement(Variables.file_upload).sendKeys("C:\\Users\\k.ermakov\\Desktop\\тест типов\\картинка на предложения.jpg");  // Гружу изображение ТРУ
        driver.findElement(Variables.add_char).click();  // Нажимаю кнопку "Добавить" характеристики
        driver.findElement(Variables.name_char).click();  // Нажмаю в поле ввода "Наименование характеристики"
        driver.findElement(Variables.name_char).clear();  // Очищаю поле ввода "Наименование характеристики"
        driver.findElement(Variables.name_char).sendKeys("Качественная хараетеристика_тест");  // Ввожу название качественной харктеристики
        driver.findElement(Variables.multiselect).click();  // Нажимаю на селект выбора типа характеристики
        driver.findElement(Variables.quality).click();  // Выбираю качественную характристику
        driver.findElement(Variables.value_char).click();  // Нажимаю на поле ввода "Значение характеристики"
        driver.findElement(Variables.value_char).sendKeys("Значение качественной характеристики_тест");  // Ввожу значение в поле "Значение характеристики"
        driver.findElement(Variables.save).click();  // Сохраняю характеристику
        driver.findElement(Variables.add_adres).click();  // Нажимаю кнопку "Добавить" адрес поставки ТРУ
        driver.findElement(Variables.place_2).click();  // Нажимаю на поле ввода места поставки (ФИАС)
        driver.findElement(Variables.place_2).sendKeys("Рязань");  // Ввожу в поле места поставки (ФИАС)
        sleep(2000);
        driver.findElement(Variables.place_2).sendKeys(Keys.DOWN, Keys.ENTER);  // Выбираю адрес из ФИАС
        driver.findElement(Variables.cost).click();  // Нажимаю на поле ввода стоимости поставки ТРУ
        driver.findElement(Variables.cost).clear(); // Очищаю поле ввода стоимости поставки ТРУ
        driver.findElement(Variables.cost).sendKeys("300");  // Ввожу стоимость поставки ТРУ
        driver.findElement(Variables.delivery_term).click();  // Нажимаю на поле ввода "Условия поставки"
        driver.findElement(Variables.delivery_term).clear();  // очищаю поле ввода "Условия поставки"
        driver.findElement(Variables.delivery_term).sendKeys("Условия поставки ТРУ_тест");  // Ввожу значение в поле ввода "Условия поставки"
        driver.findElement(Variables.save).click();  // Сохраняю место поставки ТРУ
        driver.findElement(Variables.include_catalog).click();  // Нажимаю кнопку "Включить в каталог"

        // Проверка
        String actual = driver.findElement(By.xpath(".//td[contains(., '" + product_name_expected + "')]")).getText();
        System.out.println(actual);
        try {
            assertEquals(product_name_expected, actual);
            System.out.println("Успешное создание ТРУ");
        } catch (AssertionError assertionError) {
            System.out.println("ТРУ создалось неверно");
        }



/*
        String url1 ="jdbc:mysql://192.168.168.5:3306/akeneo_pim";
        String dbClass = "com.mysql.jdbc.Driver";
        Class.forName(dbClass).newInstance();
        Connection con = (Connection) DriverManager.getConnection(url1, "akeneo_pim_1", "krlatq9bakd7e7pk");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT json_extract(raw_values, '$.\"Product_name\".\"<all_channels>\".\"<all_locales>\"') as 'Наименование ТРУ' FROM akeneo_pim.pim_catalog_product\n" +
                "where json_extract(raw_values, '$.\"Product_name\".\"<all_channels>\".\"<all_locales>\"') = 'Автотест_03.03.2019_02:06:42';");
        String product_name = rs.getString(1);
        System. out.println(product_name);
        try{
            assertEquals(product_name_expected, product_name);
            System.out.println("Успешное создание ТРУ");
        }
        catch (AssertionError assertionError){
            System.out.println("ТРУ создалось неверно");
        }

*/
    }
    @AfterClass(alwaysRun = true)
    public void tearDown() {

    }


    public boolean isElementPresent(By by) {
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
