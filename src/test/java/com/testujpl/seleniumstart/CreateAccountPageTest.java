package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.pages.CreateAccountPage;
import com.testujpl.seleniumstart.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreateAccountPageTest extends BaseTest{

    @Test
    public void asUserIWantToCreateAccount(){
        //given
        CreateAccountPage createAccountPage =  new HomePage().clickOnBtnSignIn()
                .inputTextInToTfCreateAccoutEmail("example@domain.com")
                .clickBtnCreateAnAccount()
                .checkRadioBtnGender1()
                .inputTextInToTfFirstName("FirstName")
                .inputTextInToTfLastName("LastName")
                .inputTextInToTfEmail("example@domain.com")
                .inputTextInToTfPassword("password")
                .selectDayOfBirthByIndex(1)
                .selectMonthOfBirthByIndex(1)
                .selectYearOfBirthByIndex(1)
                .checkCbSignUpForNewsletter()
                .checkCbSpecialOffers()
                .isAddressFirstNameAutofilledByCustomerFirstName();
                //TODO
        //when

        //then
        assertEquals(1,1);

    }
}
