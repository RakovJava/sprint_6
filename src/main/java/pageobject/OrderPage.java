package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    WebDriver driver;

    public OrderPage(WebDriver driver) {this.driver = driver;}
    //Первая форма заказа "Для кого самокат"
    //Поле Имя
    private final By NAME = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Имя']");
    //Поле Фамилия
    private final By SURNAME = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Фамилия']");
    //Поле Адреса
    private final By ADDRESS = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Адрес: куда привезти заказ']");
    //Поле станция метро
    private final By STATION_METRO = By.xpath(".//input[@class='select-search__input' and @placeholder='* Станция метро']");
    //Поле телефон
    private final By TELEPHONE = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private  final By CONTINUE_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Вторая форма заказа "Про аренду"
    //Поле "Когда привезти самокат"
    private final By DELIVERY_DATE = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Когда привезти самокат']");
    //Поле "Cрок аренды"
    private final By RENTAL_PERIOD = By.xpath(".//span[@class='Dropdown-arrow']");
    //Поле "Комментарий"
    private final By COMMENT_FOR_COURIER = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //Кнопка "Заказать"
    private final By ORDER_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Кнопка "Да" на модалке "Хотите оформить заказ?"
    private final By YES_BUTTON = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Модалка "Заказ оформлен"
    private final By ORDER_SUCCESS = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    //Ввод имени пользователя
    public void userName(String name) {
        driver.findElement(NAME).sendKeys(name);
    }
    //Ввод фамилии пользователя
    public void userSurname(String surname) {
        driver.findElement(SURNAME).sendKeys(surname);
    }
    //Ввод адреса пользователя
    public void userAddress(String address) {
        driver.findElement(ADDRESS).sendKeys(address);
    }
    //Ввод станции метро
    public void userStationMetro(String station) {
        String selectorStation = ".//div[@class = 'Order_Text__2broi' and text()='"+ station +"']";
        driver.findElement(STATION_METRO).click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(selectorStation)));
        driver.findElement(By.xpath(selectorStation)).click();
    }
    //Ввод телефона пользователя
    public void userTelephone(String telephone) {
        driver.findElement(TELEPHONE).sendKeys(telephone);
    }
    //Нажимаем кнопку "Далее" на первой форме
    public void clickContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
    }
    //Сценарий заполнения первой формы целиком
    public void fillingFirstForm(String name, String surname, String address, String station, String telephone) {
        userName(name);
        userSurname(surname);
        userAddress(address);
        userStationMetro(station);
        userTelephone(telephone);
    }
    //Заполнение даты бронирования
    public void fillDate(String date) {
        driver.findElement(DELIVERY_DATE).sendKeys(date);
    }
    //Заполнение срока арендны
    public void fillRentPeriod(String period) {
        String selectorPeriod = ".//div[@class='Dropdown-option' and text()='"+ period +"']";
        driver.findElement(RENTAL_PERIOD).click();
        driver.findElement(By.xpath(selectorPeriod)).click();
    }
    //Выбор цвета самоката
    public void fillColor(String color) {
        String selectorColor = ".//label[@class='Checkbox_Label__3wxSf' and @for='"+ color +"']";
        driver.findElement(By.xpath(selectorColor)).click();
    }
    //Написание комментария
    public void fillComment(String comment) {
        driver.findElement(COMMENT_FOR_COURIER).sendKeys(comment);
    }
    //Нажатие кнопки "Заказать"
    public void clickOrderButton() {
        driver.findElement(ORDER_BUTTON).click();
    }
    //Подтверждаем оформление заказа кнопкой "Да" на на модалке "Хотите оформить заказ?"
    public void confirmOrder() {
        driver.findElement(YES_BUTTON).click();
    }
    //Получаем текст об успешности заказа с модалки "Заказ оформлен"
    public String getSuccessText() {
        return driver.findElement(ORDER_SUCCESS).getText();
    }
    //Сценарий заполнения второй формы целиком
    public void fillingSecondForm(String date, String period, String color, String comment) {
        fillDate(date);
        fillRentPeriod(period);
        fillColor(color);
        fillComment(comment);
    }
}
