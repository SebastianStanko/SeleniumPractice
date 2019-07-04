package com.testujpl.seleniumstart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPage {

    @FindBy(xpath = "//ul[@class = 'product_list grid row']/li[2]//a[@class = 'product-name']")
    private WebElement imgSecondDress;

    public DressesPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnImgSecondDress(){
        this.imgSecondDress.click();
    }
}
