package io.testscripts.root;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.pages.HomePage;

public class BaseTest {

    HomePage homepage;

    public WebDriver driver;

    public WebDriverWait Wait;

    @BeforeSuite
    public void setupSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        final HomePage homepage = new HomePage(driver);
        homepage.driver.get("https://www.HomeDepot.com");

        if(driver.findElement(By.cssSelector("#headerSearch")).getAttribute("value").equals("TRUE"))
        {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            assertThat(homepage.driver.getTitle()).isEqualTo("The Home Depot Logo");

        };


        // WebDriverWait wait = new WebDriverWait(driver, 30);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headerMyAccountTitle")));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
