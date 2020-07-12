package io.testscripts;

import io.pages.HomePage;
import org.testng.annotations.Test;

@Test
public class GithubTest extends TestBase {

    public void verifyHD_Page() {
        HomePage homePage = new HomePage(driver);
        homePage.validateMyAccount();
    }
}
