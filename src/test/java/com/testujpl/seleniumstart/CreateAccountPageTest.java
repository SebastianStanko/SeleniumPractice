package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.core.DataProvider;
import com.testujpl.seleniumstart.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CreateAccountPageTest extends BaseTest{

    @Test
    public void asUserIWantToCreateAccount(){
        //given
        boolean actual = new HomePage().clickOnBtnSignIn()
                .startCreatingNewAccout()
                //when
                .fillAndSubmitCreateAccountForm()
                //then
                .isUserLogged(DataProvider.getUserFirstName(), DataProvider.getUserLastName());

        assertTrue(actual);
    }
}
