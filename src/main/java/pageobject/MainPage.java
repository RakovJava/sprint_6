package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {
    // создание экземпляра WebDriver
    WebDriver driver;

    //URL главной страницы
    public static final String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru/";

    // Конструктор класса с драйвером
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    // Кнопка заказть вверху страницы
    private final By pathOrderButtonHeadPage = By.xpath(".//button[@class='Button_Button__ra12g']");

    // Кнопка заказать внизу страницы
    private final By pathOrderButtonDownPage = By.xpath(".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");

    // Раздел "Вопросы о важном"
    private final By pathTitleImportantQuestions = By.xpath(".//div[@class='Home_FAQ__3uVm4']");

    //Проскролить до раздела "Вопросы раздела о важном"
    public void scrollPageToImportantQuestions() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(pathTitleImportantQuestions));
    }

    //Блок с вопросами
    // Вопрос №1
    private final By pathQuetion_1 = By.xpath(".//div[@id='accordion__heading-0']");
    // Вопрос №2
    private final By pathQuestion_2 = By.xpath(".//div[@id='accordion__heading-1']");
    // Вопрос №3
    private final By pathQuestion_3 = By.xpath(".//div[@id='accordion__heading-2']");
    // Вопрос №4
    private final By pathQuestion_4 = By.xpath(".//div[@id='accordion__heading-3']");
    // Вопрос №5
    private final By pathQuestion_5 = By.xpath(".//div[@id='accordion__heading-4']");
    // Вопрос №6
    private final By pathQuestion_6 = By.xpath(".//div[@id='accordion__heading-5']");
    // Вопрос №7
    private final By pathQuestion_7 = By.xpath(".//div[@id='accordion__heading-6']");
    // Вопрос №8
    private final By pathQuestion_8 = By.xpath(".//div[@id='accordion__heading-7']");

    //Блок с ответами
    // Ответ №1
    private final By pathAnswer_1 = By.xpath(".//div[@id='accordion__panel-0']");
    // Ответ №2
    private final By pathAnswer_2 = By.xpath(".//div[@id='accordion__panel-1']");
    // Ответ №3
    private final By pathAnswer_3 = By.xpath(".//div[@id='accordion__panel-2']");
    // Ответ №4
    private final By pathAnswer_4 = By.xpath(".//div[@id='accordion__panel-3']");
    // Ответ №5
    private final By pathAnswer_5 = By.xpath(".//div[@id='accordion__panel-4']");
    // Ответ №6
    private final By pathAnswer_6 = By.xpath(".//div[@id='accordion__panel-5']");
    // Ответ №7
    private final By pathAnswer_7 = By.xpath(".//div[@id='accordion__panel-6']");
    // Ответ №8
    private final By pathAnswer_8 = By.xpath(".//div[@id='accordion__panel-7']");

    //Открыть URL главной страницы
    public void mainPageOpen () {
        driver.get(MAIN_PAGE_URL);
    }

    //Нажать кнопку заказа в хедере
    public void clickOrderButtonHeader() {
        driver.findElement(pathOrderButtonHeadPage).click();
    }

    //Проскролить страницу до нижней кнопки заказа
    public void scrollPageToDownButton() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(pathOrderButtonDownPage));
    }

    //Нажать кнопку заказа внизу страницы
    public void clickOrderButtonDown() {
        driver.findElement(pathOrderButtonDownPage).click();
    }

    //Блок получения текстов ответов
    public String textAnswer1() {
        return driver.findElement(pathAnswer_1).getText();
    }
    public String textAnswer2() {
        return driver.findElement(pathAnswer_2).getText();
    }
    public String textAnswer3() {
        return driver.findElement(pathAnswer_3).getText();
    }
    public String textAnswer4() {
        return driver.findElement(pathAnswer_4).getText();
    }
    public String textAnswer5() {
        return driver.findElement(pathAnswer_5).getText();
    }
    public String textAnswer6() {
        return driver.findElement(pathAnswer_6).getText();
    }
    public String textAnswer7() {
        return driver.findElement(pathAnswer_7).getText();
    }
    public String textAnswer8() {
        return driver.findElement(pathAnswer_8).getText();
    }


    //Блок кликаем на текст вопросов
    public void clickQuestion1() {
        driver.findElement(pathQuetion_1).click();
    }
    public void clickQuestion2() {
        driver.findElement(pathQuestion_2).click();
    }
    public void clickQuestion3() {
        driver.findElement(pathQuestion_3).click();
    }
    public void clickQuestion4() {
        driver.findElement(pathQuestion_4).click();
    }
    public void clickQuestion5() {
        driver.findElement(pathQuestion_5).click();
    }
    public void clickQuestion6() {
        driver.findElement(pathQuestion_6).click();
    }
    public void clickQuestion7() {
        driver.findElement(pathQuestion_7).click();
    }
    public void clickQuestion8() {
        driver.findElement(pathQuestion_8).click();
    }

}
