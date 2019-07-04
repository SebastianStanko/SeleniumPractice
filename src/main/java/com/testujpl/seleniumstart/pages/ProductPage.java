package com.testujpl.seleniumstart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(css = "button.exclusive")
    public WebElement btnAddToCart;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    public WebElement btnProceedToCheckOut;

    public ProductPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public void clickBtnAddToCart(){
        this.btnAddToCart.click();
    }
    public void clickBtnProceedToCheckOut(){
        this.btnProceedToCheckOut.click();
    }
}
