package io.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends BasePage {

    WebDriverWait wait;

    @FindBy(id = "#headerMyAccountTitle")
    private WebElement myAccount;


    @FindBy(id = "headerSearch")
    private WebElement search;

    public HomePage(final WebDriver driver) {
        super(driver);
    }


    public void Initialize() 
    {
        driver.get("https://www.HomeDepot.com");
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
