package io.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.properties.Environment;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends AbstractPage<HomePage> {

    WebDriverWait wait;

    @FindBy(id = "#headerMyAccountTitle")
    private WebElement myAccount;


    @FindBy(id = "headerSearch")
    private WebElement search;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open the Github homepage")
    @Override
    protected void load() {
        driver.get(Environment.getProperties().url());
    }

    @Override
    protected void isLoaded() throws Error {
        assertThat(driver.getTitle()).isEqualTo("The Home Depot Logo");
    }

    @Step("Validate site components")
    public void landingPage() {

        search.isDisplayed();
    }

    public void validateMyAccount(){
        myAccount.isDisplayed();
        
    }
}
