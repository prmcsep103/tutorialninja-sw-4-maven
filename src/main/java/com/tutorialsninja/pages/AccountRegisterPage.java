package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class AccountRegisterPage extends Utility {

    By registerAccountText = By.xpath("//h1[contains(text(),'Register Account')]");
    By firstNameField = By.id("input-firstname");
    By LastNameField = By.id("input-lastname");
    By emailField = By.id("input-email");
    By telephoneField = By.id("input-telephone");
    By passwordField = By.id("input-password");
    By passwordConfirmField = By.id("input-confirm");
    By subscribeRadios = By.xpath("//fieldset[3]//input");
    By privacyPolicyCheckBox = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueBtn = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");

    By loginBtn = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public String getRegisterAccountText() {
        return getTextFromElement(registerAccountText);
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstNameField, fName);
    }

    public void enterLastName(String lName) {
        sendTextToElement(LastNameField, lName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String cPassword) {
        sendTextToElement(passwordConfirmField, cPassword);
    }

    public void selectSubscription(String option) {
        List<WebElement> radioButtons = getListOfElements(subscribeRadios);
        for (WebElement e : radioButtons) {
            if (e.getText().equals(option)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyPolicyCheckBox);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
    }

    public void registerUser(String fName, String lName, String age){
        enterLastName(fName);
        enterLastName(lName);
    }

}
