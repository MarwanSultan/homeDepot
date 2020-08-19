package io.testscripts;

import org.testng.annotations.Test;

import io.pages.HomePage;
import io.testscripts.root.BaseTest;
import io.testscripts.root;

public class HomeDepot_Test extends BaseTest {

    @Test
    public void verifyHD_Page() {
        HomePage homePage = new HomePage(driver);
        homePage.landingPage();
    }
}
