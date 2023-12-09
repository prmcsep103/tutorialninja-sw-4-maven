package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class AccountLoginPage extends Utility {

    By returningCustomerText = By.xpath("//div[@id='content']/div/div[2]//h2");
    By newCustomerText = By.xpath("//div[@id='content']/div/div[1]//h2");
    By emailAddressField = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginBtn = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public String getReturningCustomerText() {
        return getTextFromElement(returningCustomerText);

    }

    public String getNewCustomerText() {
        return getTextFromElement(newCustomerText);
    }

    public void enterEmailAddress(String email) {
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }
}
