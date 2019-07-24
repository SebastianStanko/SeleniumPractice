package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.core.DataProvider;
import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    @FindBy(css = "#id_gender1")
    private WebElement radioBtnGender1;

    @FindBy(css = "#customer_firstname")
    private WebElement tfFirstName;

    @FindBy(css = "#customer_lastname")
    private WebElement tfLastName;

    @FindBy(css = "#email")
    private WebElement tfEmail;

    @FindBy(css = "input[name='passwd']")
    private WebElement tfPassword;

    @FindBy(css = "#days")
    private WebElement ddDays;

    @FindBy(css = "#months")
    private WebElement ddMonths;

    @FindBy(css = "#years")
    private WebElement ddYears;

    @FindBy(css = "#newsletter")
    private WebElement cbNewsletter;

    @FindBy(css = "#optin")
    private WebElement cbSpecialOffers;

    @FindBy(css = "#firstname")
    private WebElement tfAddressFirstName;

    @FindBy(css = "#lastname")
    private WebElement tfAddressLastName;

    @FindBy(css = "#address1")
    private WebElement tfAddressAddress;

    @FindBy(css = "#city")
    private WebElement tfCityAddress;

    @FindBy(css = "#id_state")
    private WebElement dpStateAddress;

    @FindBy(css = "#postcode")
    private WebElement tfPostalCodeAddress;

    @FindBy(css = "#phone_mobile")
    private WebElement tfMobilePhoneAddress;

    @FindBy(css = "#submitAccount")
    private WebElement btnRegister;

    public CreateAccountPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public MyAccountPage fillAndSubmitCreateAccountForm(){
       return checkRadioBtnGender1()
        .inputTextInToTfFirstName(DataProvider.getUserFirstName())
       . inputTextInToTfLastName(DataProvider.getUserLastName())
       . inputTextInToTfPassword(DataProvider.getUserPassword())
       . selectDayOfBirthByIndex(1)
       . selectMonthOfBirthByIndex(1)
        .selectYearOfBirthByIndex(1)
        .checkCbSignUpForNewsletter()
       . checkCbSpecialOffers()
       . isAddressFirstNameAutofilledByCustomerFirstName()
       . inputTextInToTfAddressAddress(DataProvider.getUserAddress())
       . inputTextInToTfCityAddress(DataProvider.getUserCity())
       . chooseStateByIndex(1)
       . inputTextInToTfPostalCode(DataProvider.getUserPostalCode())
       . inputTextInToTfMobilePhoneAddress(DataProvider.getUserMobilePhoneNumber())
       . clickOnBtnRegister();
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

    public CreateAccountPage inputTextInToTfPassword(String passwordToInput){
        tfPassword.sendKeys(passwordToInput);
        return this;
    }

    public CreateAccountPage selectDayOfBirthByIndex(int dayOfBirth){
        Select selectDay = new Select(ddDays);
        selectDay.selectByIndex(dayOfBirth);
        return this;
    }

    public CreateAccountPage selectMonthOfBirthByIndex(int monthOfBirth){
        Select selectMonth = new Select(ddMonths);
        selectMonth.selectByIndex(monthOfBirth);
        return this;
    }

    public CreateAccountPage selectYearOfBirthByIndex(int yearOfBirth){
        Select selectYear = new Select(ddYears);
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
        if (!tfAddressFirstName.getAttribute("value").equals(tfFirstName.getAttribute("value"))||
                !tfAddressLastName.getAttribute("value").equals(tfLastName.getAttribute("value")))
        {System.out.println("Autofilled fields don't match");}
        return this;
    }

    public CreateAccountPage inputTextInToTfAddressAddress(String addressToInput){
        tfAddressAddress.sendKeys(addressToInput);
        return this;
    }

    public CreateAccountPage inputTextInToTfCityAddress(String cityToInput){
        tfCityAddress.sendKeys(cityToInput);
        return this;
    }

    public CreateAccountPage chooseStateByIndex(int indexToChoose){
        Select selectState = new Select(this.dpStateAddress);
        selectState.selectByIndex(indexToChoose);
        return this;
    }

    public CreateAccountPage inputTextInToTfPostalCode(String postalCodeToInput){
        tfPostalCodeAddress.sendKeys(postalCodeToInput);
        return this;
    }

    public CreateAccountPage inputTextInToTfMobilePhoneAddress(String numberToInput){
        tfMobilePhoneAddress.sendKeys(numberToInput);
        return this;
    }

    public MyAccountPage clickOnBtnRegister(){
        btnRegister.click();
        return new MyAccountPage();
    }
}
