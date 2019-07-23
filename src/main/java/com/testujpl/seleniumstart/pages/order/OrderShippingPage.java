package com.testujpl.seleniumstart.pages.order;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderShippingPage {

    @FindBy(css = "#cgv")
    private WebElement cbAgreeToTheTerms;

    @FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
    private WebElement btnProceedToCheckout;

    public OrderShippingPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public OrderShippingPage checkCbAgreeToTheTerms(){
        cbAgreeToTheTerms.click();
        return this;
    }

    public OrderPaymentPage clickOnBtnProceedToCheckout(){
        btnProceedToCheckout.click();
        return new OrderPaymentPage();
    }
}
