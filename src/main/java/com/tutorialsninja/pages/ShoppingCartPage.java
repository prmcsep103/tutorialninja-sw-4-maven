package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class ShoppingCartPage extends Utility {
    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By productName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By model = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By total = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    By qtyField = By.xpath("//input[contains(@name, 'quantity')]");

    By qtyUpdateBtn = By.xpath("//button[contains(@data-original-title, 'Update')]");

    By successModifiedMessage = By.xpath("//div[@id='checkout-cart']/div[1]");

    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public String getProductName() {
        return getTextFromElement(productName);
    }

    public String getDeliveryDate() {
        return getTextFromElement(deliveryDate);
    }

    public String getModel() {
        return getTextFromElement(model);
    }

    public String getTotal() {
        return getTextFromElement(total);
    }

    public void changeQuantity(String qty) {
        sendTextToElement(qtyField, qty);
    }

    public void clickOnQtyUpdateButton() {
        clickOnElement(qtyUpdateBtn);
    }

    public String getSuccessModifiedMessage() {
        return getTextFromElement(successModifiedMessage);
    }
}
