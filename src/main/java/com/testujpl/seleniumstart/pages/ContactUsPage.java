package com.testujpl.seleniumstart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ContactUsPage {

    @FindBy(css = "h1.page-heading.bottom-indent")
    private WebElement lblContactUs;

    @FindBy(css = "input#email")
    private WebElement tfEmail;

    @FindBy(css = "input#id_order")
    private WebElement tfOrderReference;

    @FindBy(css = "textarea#message")
    private WebElement tfMessage;

    @FindBy(css = "select#id_contact")
    private WebElement ddSubject;

    @FindBy(css = "button#submitMessage")
    private WebElement btnSubmitMessage;

    @FindBy(css = "div.alert.alert-danger>ol>li")
    private WebElement lblAlertDanger;

    @FindBy(css = "p.alert.alert-success")
    private WebElement lblAlertSucces;

    public ContactUsPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public boolean isLblContactUsDisplayed(){
        return this.lblContactUs.isDisplayed();
    }

    public void inputTextInToTfEmail(String textToInput){
        this.tfEmail.sendKeys(textToInput);
    }

    public void inputTextInTfOrderReference(String textToInput){
        this.tfOrderReference.sendKeys(textToInput);
    }

    public void  inputTextInTfMessage(String textToInput){
        this.tfMessage.sendKeys(textToInput);
    }

    public void selectSubjectWithId1(){
        Select chooseSubject = new Select(this.ddSubject);
        chooseSubject.selectByIndex(1);
    }

    public void clickOnBtnSubmitMessage(){
        this.btnSubmitMessage.click();
    }

    public boolean isLblAlertDangerDisplayed(){
        return this.lblAlertDanger.isDisplayed();
    }

    public String isLblAlertDangerTextAsExpected(){
         String alertMessage = this.lblAlertDanger.getText();
        return alertMessage;
    }

    public boolean isLblAlertSuccesDisplayed(){
        return this.lblAlertSucces.isDisplayed();
    }
}
