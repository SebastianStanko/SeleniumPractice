package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.driver.Driver;
import com.testujpl.seleniumstart.pages.order.OrderSummaryPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(css = "button.exclusive")
    private WebElement btnAddToCart;

    @FindBy(css = ".btn.btn-default.button.button-medium")
    private WebElement btnProceedToCheckOut;

    public ProductPage(){
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public ProductPage clickBtnAddToCart(){
        btnAddToCart.click();
        return this;
    }

    public OrderSummaryPage clickBtnProceedToCheckOut(){
        btnProceedToCheckOut.click();
        return new OrderSummaryPage();
    }
}
