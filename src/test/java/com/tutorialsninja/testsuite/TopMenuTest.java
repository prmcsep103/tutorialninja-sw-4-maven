package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.mouseHoverOnDesktopsLinkAndClick();
        homePage.selectMenu("Show AllDesktops");
        String expectedText = "Desktops";
        String actualText = desktopPage.getDesktopsText();
        Assert.assertEquals(actualText, expectedText, "Not navigate to Desktop page");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homePage.mouseHoverOnLaptopsAndNotebooksLinkAndClick();
        homePage.selectMenu("Show AllLaptops & Notebooks");
        Assert.assertEquals(laptopsAndNotebooksPage.getLaptopsAndNotebooksText(),
                "Laptops & Notebooks", "Not navigate to Laptops and Notebooks page");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.mouseHoverOnComponentLinkAndClick();
        homePage.selectMenu("Show AllComponents");
        Assert.assertEquals(componentsPage.getComponentsText(),
                "Components", "Not navigate to Laptops and Notebooks page");
    }

}
