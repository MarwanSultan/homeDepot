package io.testscripts;

import io.pages.HomePage;
import org.testng.annotations.Test;

@Test
public class HomeDepot_Test extends BaseTest {

    public void verifyHD_Page() {
        HomePage homePage = new HomePage(driver);
        homePage.landingPage();
    }
}
