package ru.stqa.pft.eat;

import org.openqa.selenium.By;

public class Variables {

    /* Аккредитация поставщика  AuthorizationIsSellerUl */
    public static final By lk = By.xpath("(.//span[contains(.,\'Личный кабинет\')])[2]");  // Кнопка "Личный кабинет"
    public static final String url_ft = "https://ft01.eat.dks.lanit.ru/"; // Адрес стенда
    public static final By input = By.xpath(".//button[contains(.,'Вход')]");  // Кнопка "Вход"
    public static final By cont = By.xpath(".//button[contains(.,'Продолжить')]"); // Кнопка "Продолжить"
    public static final By nov_1 = By.xpath(".//div[@class='multiselect__select']");  // Выпадающий список выбора типа организации
    public static final By is_seller = By.xpath("(.//span[contains(.,'Поставщик')])[2]");  //Селект "Поставщик"
    public static final By auth = By.xpath(".//a[contains(.,'Аутентификация')]"); // Кнопка "Аутентификация"
    public static final By phone = By.id("mobileOrEmail");  // Поле ввода мобильного телефона или почты (ЕСИА)
    public static final By password = By.id("password");  // Поле ввода пароля (ЕСИА)
    public static final By input_2 = By.id("loginByPwdButton");  // Кнопка "Войти" (ЕСИА)
    public static final By orga = By.xpath(".//label[contains(.,'ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"СЕЙФЛАЙН\"')]");  // Организация ЮЛ "Сейфлайн"
    public static final By fl = By.xpath(".//label[contains(.,'Ермаков')]");
    public static final By input_3 = By.xpath(".//button[contains(.,'Подтвердить')]");  // Кнопка "Подтвердить" (ЕСИА)
    public static final By orga_2 = By.xpath(".//span[contains(.,'ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"СЕЙФЛАЙН\"')]"); // Организация ЮЛ "Сейфлайн" в окошке выбора агентов
    public static final By check = By.xpath(".//div[contains(.,'Выберите организацию') and (@class = 'fs26 weight-500')]"); // Элемент, по которому проверяю есть ли окошко с выбором агентов
    public static final By input_4 = By.xpath(".//button[contains(., 'Подтвердить')]");  // Кнопка "Подтвердить" на форме выбора агентов



    /* Создание ТРУ  Product_test */
    public static final By my_TRU = By.xpath("//a[.='Мои предложения']");  // Вкладка "Мои предложения"
    public static final By add_TRU = By.xpath(".//button[contains(.,'Добавить предложение')]");  // Кнопка "Добавить предложение"
    public static final By categories = By.xpath(".//div[contains(.,'Тестовые данные(НЕ ИЗМЕНЯТЬ)') and (@class = 'categories-tree__text fs14 pointer')]");  // Категория "Тестовые данные(НЕ ИЗМЕНЯТЬ)"
    public static final By kod_EAT = By.xpath(".//div[contains ( @class, 'input-form input-form--medium relative ')]/input[@placeholder='Код ЕАТ']");  // Поле фильтра "Код ЕАТ"
 //   public static final By close = By.xpath(".//input[@placeholder = 'Код ЕАТ']/../following-sibling::*[1]/div "); // Крестик очистить поле "Код ЕАТ"
    public static final By find = By.xpath(".//button[contains(.,'Найти')]");  // Кнопка "Найти" фильтра
    public static final By choose = By.xpath(".//button[@type = 'button' and contains(@class, 'no-outline button-full block brdr-none')]"); // Кнопка "Выбрать" шаблона
    public static final By short_title = By.xpath(".//div[contains(., 'Краткое наименование') and (@class = 'col-md-5')]/following-sibling::*/descendant::*[2]");  // Поле ввода "Краткое наименование"
    public static final By trade = By.xpath(".//div[contains(., 'Торговое наименование') and (@class = 'col-md-5')]/following-sibling::*/descendant::*[2]");  // Поле ввода "Торговое наименование"
    public static final By place = By.xpath(".//div[contains(., 'Наименование места') and (@class = 'col-md-5')]/following-sibling::*/descendant::*[2]");  // Поле ввода "Наименование места происхождения товара"
    public static final By inf_manuf = By.xpath(".//div[contains(., 'Информация о производителе') and (@class = 'col-md-5')]/following-sibling::*/descendant::*[2]");  // Поле ввода "Информация о производителе товара"
    public static final By trade_2 = By.xpath(".//div[contains(., 'Фирменное наименование') and (@class = 'col-md-5')]/following-sibling::*/descendant::*[2]");  // Поле ввода "Фирменное наименование (при наличии)"
    public static final By price = By.xpath(".//div[contains(., 'Цена за единицу') and (@class = 'col-md-5')]/following-sibling::*/descendant::*[2]");  // Поле ввода "Цена за единицу"
    public static final By miltuselect = By.xpath(".//div[@class='multiselect__select']");  // Селект в поле "НДС"
    public static final By nds_choose = By.xpath(".//li[contains(., '20')]//descendant::*[2]");  // Выбор значения НДС в выпадающем списке
    public static final By end_date = By.xpath(".//input[@placeholder = 'ДД-ММ-ГГГГ']"); // Поле "Дата окончания применения"
    public static final By file_upload = By.xpath(".//input[@type = 'file']");  // Элемент куда грузить изображение ТРУ
    public static final By add_char = By.xpath("(.//span[contains(., 'Добавить') and contains(@class, 'border-box')])[1]");  // Кнопка "Добавить" характеристики
    public static final By name_char = By.xpath(".//input[@name = 'productOfferExtraFeatures[0][name]']");  // Поле "Наименование характеристики"
    public static final By multiselect = By.xpath("(.//div[@class = 'multiselect__select'])[2]");  // Селект выбра типа характеристики
    public static final By quality = By.xpath("(.//span[. = 'Качественная'])[2]");  // Тип характеристики "Качественная"
    public static final By value_char = By.xpath(".//input[@name = 'productOfferExtraFeatures[0][qualityValue][]']");  // Поле ввода "Значение характеристики"
    public static final By save = By.xpath(".//i[. = 'save']");  // Кнопка "Сохранить" характеристику
    public static final By add_adres = By.xpath("(.//span[contains(., 'Добавить') and contains(@class, 'border-box')])[2]");  // Кнопка "Добавить" место поставки
    public static final By place_2 = By.xpath(".//input[contains(@placeholder, 'Начните')]");  // Поле ввода фиаса места поставки
    public static final By cost = By.xpath(".//input[@name ='delivery[0][transport_cost]']");  // Поле ввода стоимости поставки ТРУ
    public static final By delivery_term = By.xpath(".//input[(@name ='delivery[0][max]') and @maxlength = '2000']");  // Поле ввода "Условия поставки"





    public static final By include_catalog = By.xpath(".//span[contains(., 'Включить в каталог')]");  // Кнопка "Включить в каталог"

}