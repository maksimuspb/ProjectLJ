package Lesson_5;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LJTest extends AbstractTest{

    @Test
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
    void test2(){
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
       WebElement webElement5 =driver.findElement(By.xpath(".//span[contains(text(), 'Поделиться фото')]"));
       webElement5.click();
       WebElement webElement6=driver.findElement(By.xpath(".//textarea[@class='text-0-2-106']"));
       webElement6.click();
       webElement6.sendKeys("Добавляю новое фото");
   }


}
