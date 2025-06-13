package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {
    // создание экземпляра WebDriver
    WebDriver driver;

    // Конструктор класса с драйвером
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    // Кнопка заказть вверху страницы
    private final By ORDER_BUTTON_HEADER_PAGE = By.xpath(".//button[@class='Button_Button__ra12g']");

    // Кнопка заказать внизу страницы
    private final By ORDER_BUTTON_DOWN_PAGE = By.xpath(".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");

    // Раздел "Вопросы о важном"
    private final By TITLE_IMPORTANT_QUESTIONS = By.xpath(".//div[@class='Home_FAQ__3uVm4']");

    //Проскролить до раздела "Вопросы раздела о важном"
    public void scrollPageToImportantQuestions() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(TITLE_IMPORTANT_QUESTIONS));
    }

    //Блок с вопросами
    // Вопрос №1
    private final By QUESTION_1 = By.xpath(".//div[@id='accordion__heading-0']");
    // Вопрос №2
    private final By QUESTION_2 = By.xpath(".//div[@id='accordion__heading-1']");
    // Вопрос №3
    private final By QUESTION_3 = By.xpath(".//div[@id='accordion__heading-2']");
    // Вопрос №4
    private final By QUESTION_4 = By.xpath(".//div[@id='accordion__heading-3']");
    // Вопрос №5
    private final By QUESTION_5 = By.xpath(".//div[@id='accordion__heading-4']");
    // Вопрос №6
    private final By QUESTION_6 = By.xpath(".//div[@id='accordion__heading-5']");
    // Вопрос №7
    private final By QUESTION_7 = By.xpath(".//div[@id='accordion__heading-6']");
    // Вопрос №8
    private final By QUESTION_8 = By.xpath(".//div[@id='accordion__heading-7']");

    //Блок с ответами
    // Ответ №1
    private final By ANSWER_1 = By.xpath(".//div[@id='accordion__panel-0']");
    // Ответ №2
    private final By ANSWER_2 = By.xpath(".//div[@id='accordion__panel-1']");
    // Ответ №3
    private final By ANSWER_3 = By.xpath(".//div[@id='accordion__panel-2']");
    // Ответ №4
    private final By ANSWER_4 = By.xpath(".//div[@id='accordion__panel-3']");
    // Ответ №5
    private final By ANSWER_5 = By.xpath(".//div[@id='accordion__panel-4']");
    // Ответ №6
    private final By ANSWER_6 = By.xpath(".//div[@id='accordion__panel-5']");
    // Ответ №7
    private final By ANSWER_7 = By.xpath(".//div[@id='accordion__panel-6']");
    // Ответ №8
    private final By ANSWER_8 = By.xpath(".//div[@id='accordion__panel-7']");

    //Нажать кнопку заказа в хедере
    public void clickOrderButtonHeader() {
        driver.findElement(ORDER_BUTTON_HEADER_PAGE).click();
    }

    //Проскролить страницу до нижней кнопки заказа
    public void scrollPageToDownButton() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(ORDER_BUTTON_DOWN_PAGE));
    }

    //Нажать кнопку заказа внизу страницы
    public void clickOrderButtonDown() {
        driver.findElement(ORDER_BUTTON_DOWN_PAGE).click();
    }

    //Блок получения текстов ответов
    public String textAnswer1() {
        return driver.findElement(ANSWER_1).getText();
    }
    public String textAnswer2() {
        return driver.findElement(ANSWER_2).getText();
    }
    public String textAnswer3() {
        return driver.findElement(ANSWER_3).getText();
    }
    public String textAnswer4() {
        return driver.findElement(ANSWER_4).getText();
    }
    public String textAnswer5() {
        return driver.findElement(ANSWER_5).getText();
    }
    public String textAnswer6() {
        return driver.findElement(ANSWER_6).getText();
    }
    public String textAnswer7() {
        return driver.findElement(ANSWER_7).getText();
    }
    public String textAnswer8() {
        return driver.findElement(ANSWER_8).getText();
    }


    //Блок кликаем на текст вопросов
    public void clickQuestion1() {
        driver.findElement(QUESTION_1).click();
    }
    public void clickQuestion2() {
        driver.findElement(QUESTION_2).click();
    }
    public void clickQuestion3() {
        driver.findElement(QUESTION_3).click();
    }
    public void clickQuestion4() {
        driver.findElement(QUESTION_4).click();
    }
    public void clickQuestion5() {
        driver.findElement(QUESTION_5).click();
    }
    public void clickQuestion6() {
        driver.findElement(QUESTION_6).click();
    }
    public void clickQuestion7() {
        driver.findElement(QUESTION_7).click();
    }
    public void clickQuestion8() {
        driver.findElement(QUESTION_8).click();
    }

}
