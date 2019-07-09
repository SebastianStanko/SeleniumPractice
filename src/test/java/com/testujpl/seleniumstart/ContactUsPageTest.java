package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.pages.ContactUsPage;
import com.testujpl.seleniumstart.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactUsPageTest extends BaseTest {

    private HomePage homePage;

    @Test
    public void asUserIWantToGoToContactUsPage() {
        //given
        homePage = new HomePage();

        //when
        homePage.clickOnBtnContactUs();

        ContactUsPage contactUsPage = new ContactUsPage();
        boolean actual = contactUsPage.isLblContactUsDisplayed();

        //then
        assertEquals(true, actual);
        assertTrue(actual);

    }

    @Test
    public void asUserIWantToFailSendingBecouseIDidntChooseOrderReference() {
        //given
        String emailToEnter = "email@example.com";
        String orderReferenceToEnter = "exampleOrderReference";
        String messageToEnter = "Example Message";
        String alertMessage = "Please select a subject from the list provided.";

        homePage = new HomePage();
        homePage.clickOnBtnContactUs();

        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.inputTextInToTfEmail(emailToEnter);
        contactUsPage.inputTextInTfOrderReference(orderReferenceToEnter);
        contactUsPage.inputTextInTfMessage(messageToEnter);

        //when
        contactUsPage.clickOnBtnSubmitMessage();
        String actual = contactUsPage.isLblAlertDangerTextAsExpected();

        //then

        assertTrue(actual.equals(alertMessage));

    }

    @Test
    public void asUserIWantToSendContactUsMessage() {
        //given
        String emailToEnter = "email@example.com";
        String orderReferenceToEnter = "exampleOrderReference";
        String messageToEnter = "Example Message";
        int subcjectToChoose = 1;

        homePage = new HomePage();
        homePage.clickOnBtnContactUs();

        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.inputTextInToTfEmail(emailToEnter);
        contactUsPage.inputTextInTfOrderReference(orderReferenceToEnter);
        contactUsPage.inputTextInTfMessage(messageToEnter);
        contactUsPage.selectSubjectWithId1(subcjectToChoose);

        //when
        contactUsPage.clickOnBtnSubmitMessage();
        boolean actual = contactUsPage.isLblAlertSuccesDisplayed();

        //then
        assertTrue(actual);

    }
}
