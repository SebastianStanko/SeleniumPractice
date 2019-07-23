package com.testujpl.seleniumstart.pages.order;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {

    @FindBy(css = "#total_product")
    private WebElement txTotalPrice;

    @FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
    private WebElement btnProceedToCheckout;

    public OrderSummaryPage(){
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public OrderSummaryPage checkTotalProductPrice(){
        if(!txTotalPrice.getText().equals("$50.99")){
            System.out.println("Incorrect product price!");
        }
        return this;
    }

    public OrderAuthenticationPage clickBtnProceedToCheckout(){
        btnProceedToCheckout.click();
        return new OrderAuthenticationPage();
    }
}
