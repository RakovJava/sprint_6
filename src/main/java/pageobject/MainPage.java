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
    public String textAnswer(int numberAnswer) {
        String dynamicXpathAnswer = String.format(".//div[@id='accordion__panel-%d']", numberAnswer);
        By pathAnswer = By.xpath(dynamicXpathAnswer);
        return driver.findElement(pathAnswer).getText();
    }

    //Блок кликаем на текст вопросов
    public void clickQuestion(int questionNumber) {
        String dynamicXpathQuestion = String.format(".//div[@id='accordion__heading-%d']", questionNumber);
        By pathQuestion = By.xpath(dynamicXpathQuestion);
        driver.findElement(pathQuestion).click();
    }

}
