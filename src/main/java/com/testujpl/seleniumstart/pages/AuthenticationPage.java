package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

    @FindBy(css = "#email_create")
    protected WebElement tfCreateAccountEmail;

    @FindBy(css = "#email")
    protected WebElement tfEmailToLogin;

    @FindBy(css = "#passwd")
    protected WebElement tfPasswordToLogin;

    @FindBy(css = "#SubmitLogin")
    protected WebElement btnSubmitLogin;

    @FindBy(css = "#SubmitCreate")
    protected WebElement btnCreateAnAccount;

    public AuthenticationPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public AuthenticationPage inputTextInToTfCreateAccoutEmail(String emailToEnter){
        tfCreateAccountEmail.sendKeys(emailToEnter);
        return this;
    }

    public CreateAccountPage clickBtnCreateAnAccount(){
        btnCreateAnAccount.click();
        return new CreateAccountPage();
    }

    public AuthenticationPage inputTextInToTfEmailToLogin(String emailToInput){
        tfEmailToLogin.sendKeys(emailToInput);
        return this;
    }

    public AuthenticationPage inputTextInToTfPasswordToLogin(String passwordToInput){
        tfPasswordToLogin.sendKeys(passwordToInput);
        return this;
    }

    public HomePage clickBtnSubmitLogin(){
        btnSubmitLogin.click();
        return new HomePage();
    }

}
