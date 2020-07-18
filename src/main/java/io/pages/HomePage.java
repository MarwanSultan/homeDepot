package io.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class HomePage extends BasePage {

    WebDriverWait wait;

  


    @FindBy(id = "headerSearch")
    private WebElement hdSearch;

    public HomePage(final WebDriver driver) {
        super(driver);
    }


    @Step("Validate site components")
    public void landingPage() {
        hdSearch.isDisplayed();
    }


    public void executeSearch(String var){
        hdSearch.clear();
        hdSearch.sendKeys(var);
        hdSearch.sendKeys(Keys.ENTER);
        WebElement firstItem;
        firstItem = driver.findElement(By.cssSelector("#products > div > div.js-pod.js-pod-8.plp-pod.plp-pod--default.pod-item--8 > div > div.plp-pod__image > a > img"));
        firstItem.isDisplayed();


    }

 
}
