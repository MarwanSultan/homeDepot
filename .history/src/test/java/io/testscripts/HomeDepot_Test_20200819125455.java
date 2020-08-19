package io.testscripts.root;

import io.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

public class HomeDepot_Test extends BaseTest {

    @Test
    public void verifyHD_Page() {
        HomePage homePage = new HomePage(driver);
        homePage.landingPage();
    }
}
