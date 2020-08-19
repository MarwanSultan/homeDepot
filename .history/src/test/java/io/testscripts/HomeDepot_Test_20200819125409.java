package io.testscripts;

import io.pages.HomePage;
import org.testng.annotations.Test;

public class HomeDepot_Test extends Base {

    @Test
    public void verifyHD_Page() {
        HomePage homePage = new HomePage(driver);
        homePage.landingPage();
    }
}
