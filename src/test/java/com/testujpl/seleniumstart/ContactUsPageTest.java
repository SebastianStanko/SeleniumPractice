package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactUsPageTest extends BaseTest {

    @Test
    public void asUserIWantToSendContactUsMessage() {
        //given
        Boolean actual = new HomePage().clickOnBtnContactUs()
                //when
                .fillAndSubmitContactUsForm()
                //then
                .isLblAlertSuccesDisplayed();

        assertTrue(actual);
    }
}
