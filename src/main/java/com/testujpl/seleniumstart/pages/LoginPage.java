package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "email_create")
    private WebElement tfCreateAccountEmail;

    @FindBy(id = "SubmitCreate")
    private WebElement btnCreateAnAccount;

    public LoginPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public LoginPage inputTextInToTfCreateAccoutEmail(String emailToEnter){
        tfCreateAccountEmail.sendKeys(emailToEnter);
        return this;
    }

    public CreateAccountPage clickBtnCreateAnAccount(){
        btnCreateAnAccount.click();
        return new CreateAccountPage();
    }



}
