package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    @FindBy(id = "id_gender1")
    private WebElement radioBtnGender1;

    @FindBy(id = "customer_firstname")
    private WebElement tfFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement tfLastName;

    @FindBy(id = "email")
    private WebElement tfEmail;

    @FindBy(css = "input[name='passwd']")
    private WebElement tfPassword;

    @FindBy(id = "days")
    private WebElement ddDays;

    @FindBy(id = "months")
    private WebElement ddMonths;

    @FindBy(id = "years")
    private WebElement ddYears;

    @FindBy(id = "newsletter")
    private WebElement cbNewsletter;

    @FindBy(id = "optin")
    private WebElement cbSpecialOffers;

    @FindBy(id = "firstname")
    private WebElement tfAddressFirstName;

    @FindBy(id = "lastname")
    private WebElement tfAddressLastName;

    public CreateAccountPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public CreateAccountPage checkRadioBtnGender1(){
        radioBtnGender1.click();
        return this;
    }

    public CreateAccountPage inputTextInToTfFirstName(String firstNameToInput){
        tfFirstName.sendKeys(firstNameToInput);
        return this;
    }

    public CreateAccountPage inputTextInToTfLastName(String lastNameToInput){
        tfLastName.sendKeys(lastNameToInput);
        return this;
    }

    public CreateAccountPage inputTextInToTfEmail(String emailToInput){
        tfEmail.clear();
        tfEmail.sendKeys(emailToInput);
        return this;
    }

    public CreateAccountPage inputTextInToTfPassword(String passwordToInput){
        tfPassword.sendKeys(passwordToInput);
        return this;
    }

    public CreateAccountPage selectDayOfBirthByIndex(int dayOfBirth){
        Select selectDay = new Select(this.ddDays);
        selectDay.selectByIndex(dayOfBirth);
        return this;
    }

    public CreateAccountPage selectMonthOfBirthByIndex(int monthOfBirth){
        Select selectMonth = new Select(this.ddMonths);
        selectMonth.selectByIndex(monthOfBirth);
        return this;
    }

    public CreateAccountPage selectYearOfBirthByIndex(int yearOfBirth){
        Select selectYear = new Select(this.ddYears);
        selectYear.selectByIndex(yearOfBirth);
        return this;
    }

    public CreateAccountPage checkCbSignUpForNewsletter(){
        cbNewsletter.click();
        return this;
    }

    public CreateAccountPage checkCbSpecialOffers(){
        cbSpecialOffers.click();
        return this;
    }

    public CreateAccountPage isAddressFirstNameAutofilledByCustomerFirstName() {
        if (tfAddressFirstName.getAttribute("value").isEmpty())
            System.out.println("Input jest pusty");

        return this;
    }
}
