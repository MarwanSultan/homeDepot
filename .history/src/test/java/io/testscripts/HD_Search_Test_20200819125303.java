package io.testscripts;

import org.testng.annotations.*;


import org.testng.annotations.Test;

import io.pages.HomePage;
import io.testscripts.root.BaseTest;

public class HD_Search_Test extends BaseTest {

    HomePage homepage;

    @Test
    public void productSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.executeSearch("lumber");


    }

}
