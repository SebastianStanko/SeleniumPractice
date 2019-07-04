package com.testujpl.seleniumstart;

import com.testujpl.seleniumstart.pages.ContactUsPage;
import com.testujpl.seleniumstart.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactUsPageTest extends BaseTest {


    @Test
    public void asUserIWantToGoToContactUsPage() {
        //given
        HomePage homePage = new HomePage(chromeDriver);

        //when
        homePage.clickOnBtnContactUs();

        ContactUsPage contactUsPage = new ContactUsPage(chromeDriver);
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

        HomePage homePage = new HomePage(chromeDriver);
        homePage.clickOnBtnContactUs();

        ContactUsPage contactUsPage = new ContactUsPage(chromeDriver);
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

        HomePage homePage = new HomePage(chromeDriver);
        homePage.clickOnBtnContactUs();

        ContactUsPage contactUsPage = new ContactUsPage(chromeDriver);
        contactUsPage.inputTextInToTfEmail(emailToEnter);
        contactUsPage.inputTextInTfOrderReference(orderReferenceToEnter);
        contactUsPage.inputTextInTfMessage(messageToEnter);
        contactUsPage.selectSubjectWithId1();

        //when
        contactUsPage.clickOnBtnSubmitMessage();
        boolean actual = contactUsPage.isLblAlertSuccesDisplayed();

        //then
        assertTrue(actual);

    }
}
