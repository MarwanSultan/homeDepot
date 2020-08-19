package io.testscripts;


import org.testng.annotations.Test;

import io.pages.HomePage;

public class HD_Search_Test extends BaseTest {

    HomePage homepage;

    @Test
    public void productSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.executeSearch("lumber");


    }

}
