package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class MyAccountPage extends Utility {

    By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By accountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueBtn = By.xpath("//a[contains(text(),'Continue')]");

    public String getAccountLogoutText() {
        return getTextFromElement(accountLogoutText);
    }

    public String getYourAccountHasBeenCreatedText() {
        return getTextFromElement(accountCreatedText);
    }
    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
    }
}
