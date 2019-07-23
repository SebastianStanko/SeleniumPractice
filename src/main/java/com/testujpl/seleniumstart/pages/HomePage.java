package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
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

    public AuthenticationPage clickOnBtnSignIn(){
        btnSignIn.click();
        return new AuthenticationPage();
    }

    public DressesPage clickOnBtnDresses(){
        btnDresses.click();
        return new DressesPage();
    }
}

