package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    @FindBy(css = "a[title='Contact Us']")
    private WebElement btnContactUs;

    @FindBy(css = "#block_top_menu>ul>li:nth-child(2)")//xpath //div[@id='block_top_menu']/ul/li[2]
    private WebElement btnDresses;

    @FindBy(css = ".login")
    private WebElement btnSignIn;

    public HomePage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public ContactUsPage clickOnBtnContactUs() {
        btnContactUs.click();
        return new ContactUsPage();
    }

    public LoginPage clickOnBtnSignIn(){
        btnSignIn.click();
        return new LoginPage();
    }

    public void clickOnBtnDresses() {
        this.btnDresses.click();
    }

}

