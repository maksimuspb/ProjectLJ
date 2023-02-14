package Lesson7;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class AbstractAllTest {
    static WebDriver webdriver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        webdriver = new ChromeDriver(options);
        webdriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }



    @BeforeEach
    void goTo(){
        Assertions.assertDoesNotThrow( ()-> getWebDriver().navigate().to("https://www.livejournal.com"),
                "Страница не доступна");
        Assertions.assertTrue(true);
    }




    @AfterAll
    static void close(){
        if(webdriver !=null) webdriver.quit();
    }
    public WebDriver getWebDriver(){
        return this.webdriver;
    }


}


