package com.testujpl.seleniumstart.pages.order;

import com.testujpl.seleniumstart.driver.Driver;
import com.testujpl.seleniumstart.pages.AuthenticationPage;
import org.openqa.selenium.support.PageFactory;

public class OrderAuthenticationPage extends AuthenticationPage {

    public OrderAuthenticationPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    @Override
    public OrderAuthenticationPage inputTextInToTfEmailToLogin(String emailToInput) {
        tfEmailToLogin.sendKeys(emailToInput);
        return this;
    }

    @Override
    public OrderAuthenticationPage inputTextInToTfPasswordToLogin(String passwordToInput) {
        tfPasswordToLogin.sendKeys(passwordToInput);
        return this;
    }

    public OrderAdressPage clickOnBtnSubmitLogin() {
        btnSubmitLogin.click();
        return new OrderAdressPage();
    }
}
