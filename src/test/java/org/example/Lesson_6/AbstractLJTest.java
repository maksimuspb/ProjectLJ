package org.example.Lesson_6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractLJTest {
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

