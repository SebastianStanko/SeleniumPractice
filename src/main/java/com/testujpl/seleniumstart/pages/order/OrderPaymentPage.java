package com.testujpl.seleniumstart.pages.order;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPaymentPage {

    @FindBy(css = ".bankwire")
    private WebElement btnPayByBankWire;

    public OrderPaymentPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public OrderConfirmPaymentPage clickBtnPayByBankWire() {
        btnPayByBankWire.click();
        return new OrderConfirmPaymentPage();
    }
}
