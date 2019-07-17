package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.pages.ContactUsPage;
import com.testujpl.seleniumstart.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactUsPageTest extends BaseTest {

    @Test
    public void asUserIWantToSendContactUsMessage() {
        //given
        Boolean actual = new HomePage().clickOnBtnContactUs()
                .selectSubjectById(1)
                .inputTextInToTfEmail("email@example.com")
                .inputTextInTfOrderReference("exampleRoderReference")
                .inputTextInTfMessage("Example Message")
                //when
                .clickOnBtnSubmitMessage()
                //then
                .isLblAlertSuccesDisplayed();

        assertTrue(actual);
    }
}
