package io.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;

    public BasePage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
