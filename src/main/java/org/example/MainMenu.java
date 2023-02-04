package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenu extends AbstractSite {
    @FindBy(xpath = ".//a[contains(text(), 'Войти')]")
    private WebElement enter;

    @FindBy(xpath = ".//input[@id='user']")
    private WebElement user;

    @FindBy(xpath = ".//input[@id='lj_loginwidget_password']")
    private WebElement password;

    @FindBy(name = "action:login")
    private WebElement login;

    @FindBy(xpath = ".//span[contains(text(), 'Поделиться фото')]")
    private WebElement photo;

    @FindBy(xpath = ".//textarea[@class='text-0-2-106']")
    private WebElement textarea;

    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public MainMenu clickenter() {
        enter.click();
        return this;
    }

    public MainMenu clickuser() {
        user.click();
        user.sendKeys("maksimaga1703");
        return this;
    }

    public MainMenu clickpassword() {
        password.click();
        password.sendKeys("Moscow1703");
        return this;
    }

    public MainMenu clicklogin() {
        login.click();
        return this;
    }
    public MainMenu clickphoto(){
        photo.click();
        return this;
    }
    public MainMenu clicktextarea(){
        textarea.click();
        textarea.sendKeys("Добавляю новое фото");
        return this;
    }

}








