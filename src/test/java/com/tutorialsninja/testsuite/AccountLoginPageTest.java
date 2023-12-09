package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.AccountLoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.propertyreader.PropertyReader;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class AccountLoginPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    AccountLoginPage accountLoginPage = new AccountLoginPage();
    MyAccountPage accountPage = new MyAccountPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnMyQAccountTab();
        homePage.selectMyAccountOptions("Login");
        Assert.assertEquals(accountLoginPage.getReturningCustomerText(),
                "Returning Customer", "Login page not displayed");
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnMyQAccountTab();
        homePage.selectMyAccountOptions("Login");
        accountLoginPage.enterEmailAddress(PropertyReader.getInstance().getProperty("username"));
        accountLoginPage.enterPassword(PropertyReader.getInstance().getProperty("password"));
        accountLoginPage.clickOnLoginButton();
        homePage.clickOnMyQAccountTab();
        homePage.selectMyAccountOptions("Logout");
        Assert.assertEquals(accountPage.getAccountLogoutText(), "Account Logout", "Not logged out");
    }

}
