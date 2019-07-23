package com.testujpl.seleniumstart.pages.order;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {

    @FindBy(css = ".box")//p>strong.dark
    private WebElement boxOrderSummary;

    public OrderConfirmationPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public boolean checkIfOrderIsComplete(){
          return boxOrderSummary.getText().contains("Your order on My Store is complete.");
    }
}
