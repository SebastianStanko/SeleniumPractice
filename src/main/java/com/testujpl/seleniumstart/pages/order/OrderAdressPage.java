package com.testujpl.seleniumstart.pages.order;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAdressPage {

    @FindBy(css = "textarea.form-control")
    private WebElement taAdditionalComment;

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    private WebElement btnProceedToCheckout;

    public OrderAdressPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public OrderAdressPage inputTextInToTaAdditionalComment(String commentToInput){
        taAdditionalComment.sendKeys(commentToInput);
        return this;
    }

    public OrderShippingPage clickBtnProccedToCheckout(){
        btnProceedToCheckout.click();
        return new OrderShippingPage();
    }
}
