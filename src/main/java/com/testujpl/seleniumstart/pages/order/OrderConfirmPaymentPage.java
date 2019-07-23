package com.testujpl.seleniumstart.pages.order;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmPaymentPage {

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    private WebElement btnIConfirmMyOrder;

    public OrderConfirmPaymentPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public OrderConfirmationPage clickBtnConfirmMyOrder(){
        btnIConfirmMyOrder.click();
        return new OrderConfirmationPage();
    }
}
