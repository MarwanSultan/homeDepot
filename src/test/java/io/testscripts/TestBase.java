package io.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

abstract class TestBase {

    protected WebDriver driver;

    @BeforeSuite
    public void setupSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // WebDriverWait wait = new WebDriverWait(driver, 30);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headerMyAccountTitle")));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
