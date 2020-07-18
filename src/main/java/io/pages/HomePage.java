package io.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class HomePage extends BasePage {

    public WebDriverWait wait;

    @FindBy(id = "#headerMyAccountTitle")
    private WebElement myAccount;


    @FindBy(id = "#headerSearch")
    private WebElement hdSearch;

    public HomePage(final WebDriver driver) {
        super(driver);
    }


    @Step("Validate site components")
    public void landingPage() {

        hdSearch.isDisplayed();
    }

    public void validateMyAccount(){
        myAccount.isDisplayed();
        
    }
}
