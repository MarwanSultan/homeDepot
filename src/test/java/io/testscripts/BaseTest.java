package io.testscripts;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.pages.HomePage;

abstract class TestBase {

    HomePage homepage;

    protected WebDriver driver;

    @BeforeSuite
    public void setupSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homepage = new HomePage(driver);
        homepage.driver.get("https://www.HomeDepot.com");
		WebElement HDwait;
		HDwait = homepage.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("#headerSearch")));
		HDwait.isDisplayed();
		assertThat(homepage.driver.getTitle()).isEqualTo("The Home Depot Logo");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // WebDriverWait wait = new WebDriverWait(driver, 30);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headerMyAccountTitle")));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
