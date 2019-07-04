package com.testujpl.seleniumstart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    @FindBy(css = "td#total_product")
    private WebElement txTotalPrice;

    public OrderPage (WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public String getTotalProductPrice(){
        return this.txTotalPrice.getText();
    }
}
