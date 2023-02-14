package Lesson7;
import io.qameta.allure.*;
import org.example.lesson6.bbc.AbstractTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Story("Регистрация на сайте LJ")
public class MyMainTest extends AbstractAllTest {


    @Test
    @DisplayName("Переход на страницу")
    void test(){

        WebElement webElement1 = driver.findElement(By.xpath(".//a[contains(text(), 'Войти')]"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='user']"));
        webElement2.click();
        webElement2.sendKeys("maksimaga1703");
        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='lj_loginwidget_password']"));
        webElement3.click();
        webElement3.sendKeys("Moscow1703");
        WebElement webElement4 = driver.findElement(By.name("action:login"));
        webElement4.click();
    }
    @Test
    @DisplayName("Делаем скрин")
    @Link ("http://livejournal.com")
    void testFalse() throws InterruptedException, IOException {
        Thread.sleep(1000);
        File file = MyUtils.makeScreenshot(getWebDriver(),"failure- livejournal.MyShowTest.testFalse" + System.currentTimeMillis() + ".png");
        saveScreenshot(Files.readAllBytes(file.toPath()));
        Assertions.assertTrue(true);
    }

}
