import pageobject.MainPage;
import pageobject.OrderPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderPageDownButtonTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageOpen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @ParameterizedTest
    @MethodSource("fillingData")
    void upperButtonTestOrder (String name,
                               String surname,
                               String address,
                               String station,
                               String telephone,
                               String date,
                               String period,
                               String color,
                               String comment) throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        String expectedResult = "Заказ оформлен";

        mainPage.scrollPageToDownButton();
        mainPage.clickOrderButtonDown();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        orderPage.fillingFirstForm(name, surname,address,station,telephone);
        orderPage.clickContinueButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        orderPage.fillingSecondForm(date, period, color, comment);
        orderPage.clickOrderButton();
        orderPage.confirmOrder();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String actualResult = orderPage.getSuccessText();
        assertTrue(actualResult.contains(expectedResult), "Ошибка: Заказ не успешный!");
    }

    private static Stream<Arguments> fillingData() {
        return Stream.of(
                Arguments.of("Сергей","Анатольевич","ул.Крупской д.14 к.2 кв.61","Царицыно","89087979434","15.06.2025","четверо суток","black","Уже что-то научился писать)"),
                Arguments.of("Елизавета","Владимировна","ул.Шаболовка д.30 кв.112","Шаболовская","89517979434","20.06.2025","двое суток","grey","Нужно больше практиковаться")
        );
    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

}
