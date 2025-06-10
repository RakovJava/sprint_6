import PageObject.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void compareAnswer1() {
        String expectedResult = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollPageToImportantQuestions();
        mainPage.clickQuestion1();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String actualResult = mainPage.textAnswer1();
        assertEquals(expectedResult, actualResult, "Текст ответа не верный!");
    }

    @Test
    public void compareAnswer2() {
        String expectedResult = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollPageToImportantQuestions();
        mainPage.clickQuestion2();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String actualResult = mainPage.textAnswer2();
        assertEquals(expectedResult, actualResult, "Текст ответа не верный!");
    }

    @Test
    public void compareAnswer3() {
        String expectedResult = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollPageToImportantQuestions();
        mainPage.clickQuestion3();
        String actualResult = mainPage.textAnswer3();
        assertEquals(expectedResult, actualResult, "Текст ответа не верный!");
    }

    @Test
    public void compareAnswer4() {
        String expectedResult = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollPageToImportantQuestions();
        mainPage.clickQuestion4();
        String actualResult = mainPage.textAnswer4();
        assertEquals(expectedResult, actualResult, "Текст ответа не верный!");
    }

    @Test
    public void compareAnswer5() {
        String expectedResult = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollPageToImportantQuestions();
        mainPage.clickQuestion5();
        String actualResult = mainPage.textAnswer5();
        assertEquals(expectedResult, actualResult, "Текст ответа не верный!");
    }

    @Test
    public void compareAnswer6() {
        String expectedResult = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollPageToImportantQuestions();
        mainPage.clickQuestion6();
        String actualResult = mainPage.textAnswer6();
        assertEquals(expectedResult, actualResult, "Текст ответа не верный!");
    }

    @Test
    public void compareAnswer7() {
        String expectedResult = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollPageToImportantQuestions();
        mainPage.clickQuestion7();
        String actualResult = mainPage.textAnswer7();
        assertEquals(expectedResult, actualResult, "Текст ответа не верный!");
    }

    @Test
    public void compareAnswer8() {
        String expectedResult = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollPageToImportantQuestions();
        mainPage.clickQuestion8();
        String actualResult = mainPage.textAnswer8();
        assertEquals(expectedResult, actualResult, "Текст ответа не верный!");
    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

}
