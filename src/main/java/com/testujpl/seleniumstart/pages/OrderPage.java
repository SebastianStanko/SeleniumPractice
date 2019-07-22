package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    @FindBy(css = "#total_product")
    private WebElement txTotalPrice;

    public OrderPage (){
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public String getTotalProductPrice(){
        return this.txTotalPrice.getText();
    }
}
