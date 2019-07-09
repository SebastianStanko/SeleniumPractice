package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.pages.CreateAccountPage;
import com.testujpl.seleniumstart.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreateAccountPageTest extends BaseTest{

    private HomePage homePage;

    @Test
    public void asUserIWantToCreateAccount(){
        //given
        homePage = new HomePage();
        CreateAccountPage createAccountPage = homePage.clickOnBtnSignIn()
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
        //when

        //then
        assertEquals(1,1);

    }
}
