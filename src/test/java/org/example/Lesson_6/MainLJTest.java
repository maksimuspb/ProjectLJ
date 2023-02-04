package org.example.Lesson_6;

import org.example.MainMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class MainLJTest extends AbstractLJTest{
    @Test
    void mainMenuLoginTest(){
        MainMenu mainMenu=new MainMenu(getWebDriver());
        mainMenu
                .clickenter()
                .clickuser()
                .clickpassword();
    }
    @Test
    void TakePhotoTest(){
        MainMenu mainMenu = new MainMenu(getWebDriver());
        mainMenu
                .clickenter()
                .clickuser()
                .clickpassword()
                .clicktextarea()
                .clickphoto();
    }
}
