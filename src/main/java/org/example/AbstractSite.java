package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractSite {
    private WebDriver driver;

    public AbstractSite(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver(){
        return this.driver;
    }
}
