package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.core.DataProvider;
import com.testujpl.seleniumstart.driver.Driver;
import com.testujpl.seleniumstart.driver.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class ContactUsPage {

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

    @FindBy(css = "p.alert.alert-success")
    private WebElement lblAlertSucces;

    public ContactUsPage(){
        Waits.implicitlyWait(2);
        PageFactory.initElements(Driver.getInstance(),this);
    }

    public ContactUsPage fillAndSubmitContactUsForm(){
        return selectSubjectById(1)
                .inputTextInToTfEmail(DataProvider.getUserEmail())
                .inputTextInTfOrderReference("exampleRoderReference")
                .inputTextInTfMessage("Example Message")
                .clickOnBtnSubmitMessage();
    }

    public ContactUsPage inputTextInToTfEmail(String textToInput){
        tfEmail.sendKeys(textToInput);
        return this;
    }

    public ContactUsPage inputTextInTfOrderReference(String textToInput){
        tfOrderReference.sendKeys(textToInput);
        return this;
    }

    public ContactUsPage inputTextInTfMessage(String textToInput){
        tfMessage.sendKeys(textToInput);
        return this;
    }

    public ContactUsPage selectSubjectById(int subjectToSelect){
        Select chooseSubject = new Select(this.ddSubject);
        chooseSubject.selectByIndex(subjectToSelect);
        return this;
    }

    public ContactUsPage clickOnBtnSubmitMessage(){
        btnSubmitMessage.click();
        return this;
    }

    public boolean isLblAlertSuccesDisplayed(){
        String succesMessage = "Your message has been successfully sent to our team.";
        return lblAlertSucces.getText().equals(succesMessage);
    }
}
