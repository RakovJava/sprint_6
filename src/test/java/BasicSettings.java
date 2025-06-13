import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.MainPage;

import java.time.Duration;

public abstract class BasicSettings {
    protected ChromeDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageOpen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }
}
