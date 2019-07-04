package com.testujpl.seleniumstart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    @FindBy(css = "a[title='Contact Us']")
    private WebElement btnContactUs;

    @FindBy(css = "#block_top_menu>ul>li:nth-child(2)")//xpath //div[@id='block_top_menu']/ul/li[2]
    private WebElement btnDresses;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnBtnContactUs() {
        btnContactUs.click();
    }

    public void clickOnBtnDresses() {
        this.btnDresses.click();
    }

}

